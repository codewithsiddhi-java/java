public class vowels
{
public static void main(String[] arg)
{
int i;
char ch;
String str="hie welcome";
System.out.print("the vowels from string are=");
for(i=0;i<str.length();i++)
{
ch=str.charAt(i);//assignment of index value to ch
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U')
{
System.out.print(" "+ch);
}
}
}
}
