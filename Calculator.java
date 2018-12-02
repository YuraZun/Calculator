import javax.swing.*;
import java.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class Calculator {
    JPanel windowContent;
    JTextField displayField;
    JButton button 0;
    JButton button 1;
    JButton button 2;
    JButton button 3;
    JButton button 4;
    JButton button 5;
    JButton button 6;
    JButton button 7;
    JButton button 8;
    JButton button 9;
    JButton button buttonPoint;

    JButton button buttonEqual;
    JPanel p1;

// В конструкторе создаются все компоненты
// и добавляются на фрейм с помощью комбинации
// Borderlayout и Gridlayout

    Calculator(){

        windowContent = new JPanel();

//Задаем схему для этой панели
BorderLayout bl = new BorderLayout();
windowContent.setLayout(b1);

//Создаем и отображаем поле
//Добавляем его в Северную область окна

displayField = new JTextField(30);
windowContent.add("North",displayField);

//Создаем кнопки используя конструктор
//класс JButton, который принимает текст
//кнопки в качестве параметра
button0=new JButton("0");
button0=new JButton("1");
button0=new JButton("2");
button0=new JButton("3");
button0=new JButton("4");
button0=new JButton("5");
button0=new JButton("6");
button0=new JButton("7");
button0=new JButton("8");
button0=new JButton("9");
buttonPoint = new JButton(".");
buttonEqual = new JButton("=");

//Создаем панель с GridLayout
//которая содержит 12 кнопок - 10 кнопок с числами
//и кнопки с точкой и знаком равно

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        p1.setLayout(gl);

//Добавляем кнопки на панель p1

p1.add(button1);
p1.add(button2);
p1.add(button3);
p1.add(button4);
p1.add(button5);
p1.add(button6);
p1.add(button7);
p1.add(button8);
p1.add(button9);
p1.add(button0);
p1.add(buttonPoint);
p1.add(buttonEqual);

//Помещаем панель p1 в центральную область окна
windowContent.add("Center",p1);

//Создаем фрейм и задаем его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane();
}
