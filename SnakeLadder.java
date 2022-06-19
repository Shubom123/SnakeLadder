public class SnakeLadder{
final static int source = 0;
final  static  int destination = 100;

public static void main(String args[]){
System.out.println("Welcome to snake and ladder game");
int position=0;
int diceRoll=0;

while(position != destination)
{

diceRoll++;
int randomCheck=(int) Math.floor(Math.random() * 10) % 6+1;
int randomCheck1=(int) Math.floor(Math.random() * 10) % 4;
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
case 3:
System.out.println("Normal");
position += randomCheck;
break;

}
if (position == 100) {
break;
}
else if (position > 100) {
position -= randomCheck;
System.out.println("Dice Face is invalid so, stay on same position.");
}
else if (position < 0) {
position = source;
System.out.println("You came back to start.");
}
else {
System.out.println("New Position: " + position);
}
}
System.out.println("Your winning position: " + position);
System.out.println("Number of time dicerolled: " + diceRoll);
}
}
