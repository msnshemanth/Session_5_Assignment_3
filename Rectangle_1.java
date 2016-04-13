package Assign_5;

class Rectangle_1 
{ 
      int length ; 
      int breadth ; 
        Rectangle_1() 
        { 
            
           length = breadth = 0 ; 
         } 
         Rectangle_1(int side) 
         { 
            
            length = breadth = side ; 
         } 
         Rectangle_1(int l,int b) 
         { 
           
            length = l ; 
            breadth = b ; 
         } 
         int area() 
         { 
           return (length * breadth) ; 
         } 
} 