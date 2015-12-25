package com.levon.algorithms.sorting.questions;

public class TreeHeightWithStackNoRecursion {

}
//{
//    Stack nodes = new Stack();
//    Stack levels = new Stack();
//    stack.push(root);
//    levels.push(0);
//    int maxLevel = 0;
//
//     while(!stack.isEmpty()) {
//              
//           Node currentNode = stack.pop();
//           int currentLevel = levels.pop();
//
//          if(currentLevel > maxLevel) {
//                maxLevel = currentLevel;
//           }
//           
//          if(currentNode.getRightChild() != null) {
//              stack.push(currentNode.getRightChild());
//              levels.push(currentLevel + 1);  
//        }
//        
//            if(currentNode.getRightChild() != null) {
//                   stack.push(currentNode.getRightChild());
//                   levels.push(currentLevel + 1);
//              }
//     }
// 
// return maxLevel;
//}