package datacamp;

import tech.tablesaw.api.Table;

public class DataCleaningExercise {

    public static void main(String[] args) {
        // Create a sample DataFrame
        Table df = Table.read().csv("data.csv");
        System.out.println(df.print());

        Table removeColumnsWithMissingValues = df.removeColumnsWithMissingValues();
        System.out.println(removeColumnsWithMissingValues.print());

        Table dropDuplicateRows = removeColumnsWithMissingValues.dropDuplicateRows();
        System.out.println(dropDuplicateRows.print());

        Table notEqualTo200 = df.where(df.intColumn("Order Amount").isLessThanOrEqualTo(200));
        System.out.println(notEqualTo200.print());

    }

}
