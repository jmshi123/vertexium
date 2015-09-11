package org.vertexium.accumulo.iterator;

import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Value;
import org.apache.accumulo.core.iterators.WrappingIterator;
import org.apache.hadoop.io.Text;

import java.io.IOException;

public class HistoryCompactingIterator extends WrappingIterator {
    private Text lastHistoryRow = new Text();
    private Text lastHistoryColumnFamily = new Text();
    private Text lastHistoryColumnQualifier = new Text();
    private Text lastHistoryColumnVisibility = new Text();
    private Value lastHistoryValue = new Value();

    @Override
    public void next() throws IOException {
        while(true) {
            super.next();
            if(!super.hasTop()){
                break;
            }
            Key currentKey = getSource().getTopKey();
            Text row = currentKey.getRow();
            Text columnFamily = currentKey.getColumnFamily();
            Text columnQualifier = currentKey.getColumnQualifier();
            Text columnVisibility = currentKey.getColumnVisibility();
            Value value = getSource().getTopValue();
            if (!row.equals(lastHistoryRow)
                    || !columnFamily.equals(lastHistoryColumnFamily)
                    || !columnQualifier.equals(lastHistoryColumnQualifier)
                    || !columnVisibility.equals(lastHistoryColumnVisibility)
                    || !value.equals(lastHistoryValue)) {
                // keep the current row
                lastHistoryRow = row;
                lastHistoryColumnFamily = columnFamily;
                lastHistoryColumnQualifier = columnQualifier;
                lastHistoryColumnVisibility = columnVisibility;
                lastHistoryValue = value;
                break;
            }
        }
    }
}
