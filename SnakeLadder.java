public class SnakeLadder{
public static void main(String args[]){
System.out.println("Welcome to snake and ladder game");
int position=0;
int randomCheck=(int) Math.floor(Math.random() * 10) % 6+1;
int randomCheck1=(int) Math.floor(Math.random() * 10) % 3;
int randomCheck2=(int) Math.floor(Math.random() * 10) % 20+3;
System.out.println(randomCheck);
switch(randomCheck1){
case 0:
System.out.println("No play");
position += 0;
break;
case 1:
System.out.println("Ladder");
position += randomCheck2;
break;
case 2:
System.out.println("Snake");
position -= randomCheck2;
break;
}
}
}
