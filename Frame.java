import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;


public class Frame extends JFrame{
    Calendar calendar;
    Container c;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    Frame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("my clock program");
        this.setSize(350,200);
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        c=this.getContentPane();
        c.setBackground(Color.PINK);

        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        dayFormat=new SimpleDateFormat("EEEEEE");
        dateFormat=new SimpleDateFormat("MMMMMM dd, yyyy");

        timeLabel=new JLabel();
        timeLabel.setFont(new Font("Time Ne Romans",Font.PLAIN,55));
        timeLabel.setForeground(Color.GREEN);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);


        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Italic",Font.BOLD,35));
        dayLabel.setForeground(Color.BLUE);


        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Italic",Font.BOLD,25));
        dateLabel.setForeground(Color.BLUE);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();

    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
        public static void main(String[] args) {
            Frame frame = new Frame();
        }
}

