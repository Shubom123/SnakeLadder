public class SnakeLadder{
final static int source = 0;
final  static  int destination = 100;

public static void main(String args[]){
System.out.println("Welcome to snake and ladder game");
int position=0;
int diceRoll=0;
int position2=0;
int diceRoll2=0;
int randomCheck=(int) Math.floor(Math.random() * 10) % 6+1;
int randomCheck1=(int) Math.floor(Math.random() * 10) % 4;
int randomCheck2=(int) Math.floor(Math.random() * 10) % 20+3;

while(position < destination && position2 < destination)
{

diceRoll++;

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

diceRoll2++;

System.out.println(randomCheck);
switch(randomCheck1){
case 0:
System.out.println("No play");
position2 += 0;
break;
case 1:
System.out.println("Ladder");
position2 += randomCheck2;
break;
case 2:
System.out.println("Snake");
position2 -= randomCheck2;
break;
case 3:
System.out.println("Normal");
position2 += randomCheck;
break;
}
if (position2 == 100) {
break;
}
else if (position2 > 100) {
position2 -= randomCheck;
System.out.println("Dice Face is invalid so, stay on same position.");
}
else if (position2 < 0) {
position2 = source;
System.out.println("You came back to start.");
}
else {
System.out.println("New Position: " + position2);
}
}
System.out.println("Player1's position is : "+position);
System.out.println("Number of times game played : "+diceRoll);
System.out.println("Player2's position is : "+position2);
System.out.println("Number of times game played : "+diceRoll2);
if (position==100) {
System.out.println("Player1 has Won");
}
else {
System.out.println("Player2 has Won");
}
}
}
