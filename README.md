This class is made to replace a Scanner instance in your command line interface, because there is a problem when using the scanner to read an int/long followed by reading a String.
By using an instance of this class through your project, the aim is, you need not worry about the extra .nextLine();

Usage:

//instance
UIScannerGuard scannerGuard = new UIScannerGuard();
int tal = scannerGuard.readLong("Enter 10");
String text = scannerGuard.readLine("Enter hej");

To close the scanner that's inside code

scannerGuard.getScanner().close();
