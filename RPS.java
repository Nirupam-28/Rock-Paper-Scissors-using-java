import java.util.*;
import java.io.*;
public class RPS{
    public static void main(String args[]){
        System.out.println("\n\n\t\t\tEnter 1 for Playing and 0 to exit");
        Scanner sc=new Scanner(System.in);        
        int play=sc.nextInt();
        if(play==1){
         System.out.println("\n\n\t\t\tEnter how many matches you want to play");
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
        Random r=new Random();
        int pc=r.nextInt(3);
        int won=0;
        int lose=0;
        int draws=0;
        System.out.println("\n\n\t\t\tEnter 0 for rock, 1 for Paper, 2 for Scissor");
        Scanner s=new Scanner(System.in);
        int user=s.nextInt();
               if (user==pc){
        System.out.println("Draw Match!!!!!");
    draws++;}
        if (user==0 &&pc==1){
        System.out.println("You lost");
    lose++;}
        else if (user==1&&pc==0){
        System.out.println("You won!!! Hurray");
    won++;}
        if (user==1&&pc==2){
        System.out.println("You lost");
    lose++;}
        else if (user==2&&pc==1){
        System.out.println("You won!!! Hurray");
    won++;}
        if (user==2&&pc==0){
        System.out.println("You lost");
    lose++;}
        else if (user==0&&pc==2){
        System.out.println("You won!!! Hurray");
        won++;
    }
    System.out.println("Computer chose"+"  "+pc);
    System.out.println("You won"+"  "+won +" "+"times");
    System.out.println("You lost"+"  "+lose +" "+"times");
    System.out.println("Draws"+"  "+draws +" "+"times");
    System.out.println("");
    }
}
    else{
      System.out.println("exited");
    }
}
}
    