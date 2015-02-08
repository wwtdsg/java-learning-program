/**this is a test Demo for java
 * version 0.1
 * author wangtao
 */

import javax.swing.*;
class Ch2Sample1
{
    public static void main (String[] args){
        int[] arr = new int[4];
        arr[3] = 1;
        JFrame myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle("My First Java Program");
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
