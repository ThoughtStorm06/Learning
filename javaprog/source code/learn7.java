//   CONDITIONAL STATEMENTS AND LOOPS

/*
  Before we dive into the conditional statements, we have to learn about relational operators.

  ---> Relational Operators

   Relational operators are used to compare two values and return a boolean result. 
  The relational operators are
  == (equal to)
  != (not equal to)
  > (greater than)
  < (less than)
  >= (greater than or equal to)
  <= (less than or equal to)
  These operators are used in conditional statements to make decisions based on the comparison of two values.
  
  --> Logical Operators
  we also have logical operators which are used to combine multiple conditions and return a boolean
  The logical operators are
  && (logical AND)
  || (logical OR)
  ! (logical NOT)
  These operators are used in conditional statements to make decisions based on the combination of multiple conditions.
 */
/*
  Conditional statements are used to make decisions based on the result of a condition.
  There are two types of conditional statements in Java:
  if statement
  switch statement
   
  there are four types of if statements in java
  if statement
  if-else statement
  if-else if statement
  nested if statement
  The if statement is used when you want to make a decision based on a single condition.
  The if-else statement is used when you want to make a decision based on a single condition and provide an alternative action if the condition 
  is false.

  Syntax for all the if statements are :
-->if statement - to check single condition
  if (condition) {
    // code to be executed if the condition is true
  }


-->if-else statement- to check single condition and provide an alternative action if the condition is false
  if(condition)
  {
    // code to be executed if the condition is true
  }
  else
  {
    // code to be executed if the condition is false
  }

-->if-else if statement - to check multiple conditions and provide an alternative action for each condition
  if(condition1)
  {
    // code to be executed if the condition1 is true
  }
  else if(condition2)
  {
    // code to be executed if the condition2 is true
  }
  else if(condition3)
  {
    // code to be executed if the condition3 is true
  }
  else
  {
    // code to be executed if all the conditions are false
  }

-->nested if statement -
  A nested if statement is an if statement inside another if statement. This allows you to make decisions based on more than one condition.
   Nested if statements are useful when you need to test additional conditions after an initial condition is true.
  
   if(condition1)
  {
    // code to be executed if the condition1 is true
    if(condition2)
    {
      // code to be executed if the condition2 is true
    }
    else
    {
      // code to be executed if the condition2 is false
    }
  }

  
  */


  // Suprising fact is, u can directly write true or false in if statements without the need for conditionals if u desire too.
  // and u can even use 1 for true boolean , and 0 for false boolean. this workd too.
