class dairymilk
{
int i;
dairymilk(int i)
{
this.i=i;
System.out.println("enjoy the dairymilk");
}}
class dairymilk_silk extends dairymilk
{
int j;
dairymilk_silk(int i, int j)
{
super(i);
this.j=j;
System.out.println("enjoy the dairymilk silk");
}}
class dairymilk_hazelnut extends dairymilk_silk
{
int k;
dairymilk_hazelnut(int i, int j,int k)
{
super(i,j);
this.k=k;
System.out.println("enjoy the dairymilk hazelnut");
}}
class consmult
{
public static void main(String[] arg)
{
dairymilk_hazelnut h=new dairymilk_hazelnut(10,20,30);
}
}