
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BMI1
{
JFrame f = new JFrame("BMI");
JLabel l1,l2;
JButton b1,b2;
JTextField p1,p2;
JTextArea ta;
JPanel pane;
BMI1()
{
f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());
l1=new JLabel("HEIGHT :");
l2=new JLabel("WEIGHT :");
b1=new JButton("Submit");
b2=new JButton("Clear");
p1=new JTextField(50);
p2=new JTextField(50);
ta=new JTextArea(20,30);
pane=new JPanel(null);
f.getContentPane().setBackground(Color.YELLOW);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
double h,w,value;
w = Double.parseDouble(p2.getText());
h= Double.parseDouble(p1.getText());
System.out.println(h + " and "+ w);
value=(w/(h*h));
System.out.println(value);
ta.append("Height :" + h + "\n");
ta.append("Weight :" + w + "\n");
if(value>25)
{
ta.setText(value+"  Overweight"+"\n");
}
else if(value>18.5&&value<24.9)
{
ta.setText(value+"  Normal Weight"+"\n");
}
else
{
ta.setText(value+"  Under Weight" + "\n");
}
}
});
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
ta.setText(" ");
}
});
f.add(l1);
f.add(p1);
f.add(l2);
f.add(p2);
f.add(b1);
f.add(b2);
f.add(ta);
}
public static void main(String args[])
{
new BMI1();
}

}