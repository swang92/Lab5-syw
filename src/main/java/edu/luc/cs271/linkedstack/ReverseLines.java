package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {

    LinkedStack<String> LinkedStack2 = new LinkedStack<>();

    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      final String line = input.nextLine();
        LinkedStack2.push(line);}

      while (!LinkedStack2.isEmpty()) {
        System.out.println(LinkedStack2.peek());
        LinkedStack2.pop();
      }
    }
  }



