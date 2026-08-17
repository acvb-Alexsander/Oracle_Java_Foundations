String n1="Is it cold?", n2= "Is it heavey?", n3= "Is it long?";
String n1="Is it cold?", n2= "Is it heavey?", n3= "Is it long?";
String n1="Is it cold?", n2= "Is it heavey?", n3= "Is it long?";
double v1 = 142.7, v2 =12.52, v3=36.9;
double v1 = 142.7, v2 =12.52, v3=36.9;
double v1 = 142.7, v2 =12.52, v3=36.9;
String u1 = "K", u2="kg", u3="s";
String u1 = "K", u2="kg", u3="s";
String u1 = "K", u2="kg", u3="s";
String m1 = n1+"\t"+v1+" "+u1;
System.out.println(m1)
final double absoluteZero=-459.67;
String m2 = n2+"\t"+v2+" "+u2;
String m3 = n3+"\t"+v3+" "+u3;
System.out.println(m1)
System.out.println(m2)
System.out.println(m3)
int s1 = m1.indexOf(' ');
int s2 = m1.indexOf(' ',s1+1);
int s3 = m1.indexOf(' ',s2+1);
int s4 = m1.indexOf('\t');
String textValue =m1.substring(s4+1,s3);
m1.substring(0,s4)
m1.substring(0,s4).toUpperCase()
m1
int counter = 0;
String measurementResult = (++counter)+ " " + m1+"\n"+(++counter) + " " +m2+ "\n"+ (++counter)+ " " +m3+"\n";
System.out.println(measurementResult);