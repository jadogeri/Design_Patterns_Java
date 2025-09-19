package structural.adapter;

public class AdapterRunner {

    public static void main(String[] args) {


        // Using the old printer directly (legacy client)
        LegacyPrintable legacyClientPrinter = new LegacyPrinter();
        legacyClientPrinter.printDocument("Printing from legacy client.");

        // Using the new printer interface with the adapter (modern client)
        LegacyPrintable legacyPrinterInstance = new LegacyPrinter();
        ModernPrintable modernClientPrinter = new PrinterAdapter(legacyPrinterInstance);

        modernClientPrinter.print("Printing from modern client using adapter.");
        modernClientPrinter.printPage("Printing page 1 using adapter.");
    }
}
