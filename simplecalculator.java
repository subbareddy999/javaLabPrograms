import java.awt.*;
import java.awt.event.*;
class SimpleCalculator extends Frame implements ActionListener
{
	TextField tf1;
	Button b[],b1;
	Panel p1,p2;
	char OP;
	
	int num1,num2,result;

	public SimpleCalculator()
	{
		setLayout(new FlowLayout());
		tf1=new TextField(15);
		b=new Button[16];
		b1=new Button("CLEAR");
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(i+"");
		}
		b[10]=new Button("+");
		b[11]=new Button("-");
		b[12]=new Button("*");
		b[13]=new Button("/");
		b[14]=new Button("%");
		b[15]=new Button("=");

		p1=new Panel();
		p2=new Panel();
		p1.add(tf1);
		p1.add(b1);

		p2.setLayout(new GridLayout(4,4,10,10));
		p2.add(b[1]);
		p2.add(b[2]);
		p2.add(b[3]);
		p2.add(b[10]);
		p2.add(b[4]);
		p2.add(b[5]);
		p2.add(b[6]);
		p2.add(b[11]);
		p2.add(b[7]);
		p2.add(b[8]);
		p2.add(b[9]);
		p2.add(b[12]);
		p2.add(b[0]);
		p2.add(b[13]);
		p2.add(b[14]);
		p2.add(b[15]);

		add(p1);
		add(p2);
		

		for(int i=0;i<16;i++)
		{
			b[i].addActionListener(this);
		}
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
        String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
			tf1.setText(tf1.getText()+str);
		else if(str.equals("+")) 
		{
			num1=Integer.parseInt(tf1.getText());
			OP='+';
			tf1.setText(""); 
		}
		else if(str.equals("-")) 
		{
			num1=Integer.parseInt(tf1.getText());
			OP='-';
			tf1.setText("");
		}
		else if(str.equals("*")) 
		{
			num1=Integer.parseInt(tf1.getText());
			OP='*';
			tf1.setText("");
		}
		else if(str.equals("/")) 
		{
			num1=Integer.parseInt(tf1.getText());
			OP='/';
			tf1.setText("");
		}
		else if(str.equals("%"))
		{
			num1=Integer.parseInt(tf1.getText());
			OP='%';
			tf1.setText("");
		}
		
		if(str.equals("="))
		{
			num2=Integer.parseInt(tf1.getText());
			if(OP=='+')
				result=num1+num2;
			else if(OP=='-')
				result=num1-num2;
			else if(OP=='*')
				result=num1*num2;
			else if(OP=='/')
				result=num1/num2;
			else if(OP=='%')
				result=num1%num2;
			tf1.setText(""+result);
		}
		if(str.equals("CLEAR"))
		{
			tf1.setText("");
		}
	}
	public static void main(String args[])
	{
		SimpleCalculator s=new SimpleCalculator();
		s.setSize(300,300);
		s.setVisible(true);
		s.setTitle("Calculator");
	}
}
