package datacamp;

import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.StringColumn;
import tech.tablesaw.api.*;

import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        // Create a sample DataFrame
        Table df = Table.read().csv("data.csv");

        System.out.println("Initial DataFrame:");
        System.out.println(df.print());

        // Remove duplicate rows based on all columns
        Table deduplicatedDf = df.dropDuplicateRows();

        System.out.println("DataFrame after removing duplicates:");
        System.out.println(deduplicatedDf.print());

        Table dropRowsWithMissingValues = df.dropRowsWithMissingValues();
        System.out.println("DataFrame after dropRowsWithMissingValues:");
        System.out.println(dropRowsWithMissingValues.print());

//        boolean isValid = df.stringColumn("Order Amount")
//                .allMatch(value -> value.matches("\\$\\d+"));

//        var isValid = df.stringColumn("Order Amount").appendMissing();
//        System.out.println(isValid);

        Table notMissing = df.where(df.dateColumn("Order Date").isNotMissing());
        System.out.println("DataFrame after filtering missing dates: " + notMissing.print());

        Table dropWhere = df.dropWhere(df.dateColumn("Order Date").isMissing());
        System.out.println(dropWhere.print());


        Table removeColumnsWithMissingValues = df.removeColumnsWithMissingValues();
        System.out.println("DataFrame after removeColumnsWithMissingValues:");
        System.out.println(removeColumnsWithMissingValues.print());

    }

}
