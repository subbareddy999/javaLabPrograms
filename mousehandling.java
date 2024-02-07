import java.awt.*;
import java.awt.event.*;

class mousehandling extends Frame implements MouseListener {
    Label l; String msg;
    public mousehandling() {
        setLayout(new FlowLayout());
            l = new Label("Mouse Operations                    ");
            add(l);
            
            this.addMouseListener(this);
        }

        public void mouseClicked(MouseEvent me) {
            msg = "Mouse Clicked " + me.getX()+" "+me.getY();
            l.setText(msg);
            setBackground(Color.yellow);
        }
        public void mousePressed(MouseEvent me){
            msg = "Mouse Pressed " + me.getX()+" "+me.getY();
            l.setText(msg);
            setBackground(Color.pink);
        }
        public void mouseReleased(MouseEvent me) {
            msg = "Mouse Released " + me.getX()+" "+me.getY();
            l.setText(msg);
            setBackground(Color.cyan);
        }   
        public void mouseEntered(MouseEvent me) {
            msg = "Mouse Entered " + me.getX()+" "+me.getY();
            l.setText(msg);
            setBackground(Color.green);
        }
        public void mouseExited(MouseEvent me) {
            msg = "Mouse Exited " + me.getX()+" "+me.getY();
            l.setText(msg);
            setBackground(Color.red);
        }

        public static void main(String[] args) {
            mousehandling m = new mousehandling();
            m.setTitle("Mouse Handling");
            m.setVisible(true);
            m.setSize(500,700);
            m.setBackground(Color.green);
        }
}