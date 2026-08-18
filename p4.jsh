String [] IMPERIAL_UNITS = new String[3];
IMPERIAL_UNITS.length
IMPERIAL_UNITS
IMPERIAL_UNITS[0] = "ft"
IMPERIAL_UNITS[1] = "lb"
IMPERIAL_UNITS[2] = "F"
IMPERIAL_UNITS
IMPERIAL_UNITS[1].toUpperCase()
IMPERIAL_UNITS
IMPERIAL_UNITS[1]=IMPERIAL_UNITS[1].toUpperCase()
IMPERIAL_UNITS
String[] SI_UNITS= {"s","m","kg","A","K","mol","cd"};
SI_UNITS.length-1
SI_UNITS
String n1= "Is it cold?", n2 = "Is it Heavy?", n3 = "Is it long";
String n1= "Is it cold?", n2 = "Is it Heavy?", n3 = "Is it long";
String n1= "Is it cold?", n2 = "Is it Heavy?", n3 = "Is it long";
String[] notes = {n1,n2,n3};
var values = new double[] {142.7, 12.52, 36.9};
SI_UNITS
String[] units = {SI_UNITS[4],IMPERIAL_UNITS[1],IMPERIAL_UNITS[0]};
final double ft1m=0.3048;
final double lb2kg = 0.4536;
values[1] *= ft1m
units[1] = SI_UNITS[1]
values[2] *=lb2kg
units[2] = SI_UNITS[2]
values
units
String[] measurements = new String[3];
measurements[0] = notes[0]+'\t'+values[0]+" " +units[0];
measurements[0] = notes[1]+'\t'+values[1]+" " +units[1];
measurements[2] = notes[2]+'\t'+values[2]+" " +units[2];
measurements[1] = notes[1]+'\t'+values[1]+" " +units[1];
measurements[0] = notes[0]+'\t'+values[0]+" " +units[0];
measurements
int counter =0;
String measurementsReport = (++counter)+" "+ measurements[counter-1]+"\n"+(++counter)+" "+measurements[counter-1]+"\n"+(++counter)+" "+measurements[counter-1]+"\n";
System.out.println(measurementsReport)