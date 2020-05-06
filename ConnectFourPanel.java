
package javaapplication11;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ConnectFourPanel extends JPanel implements MouseListener,MouseMotionListener{

	private static final long serialVersionUID = 1L;
	private static int circleWidth,circleHeight;
	private static int fX,fY;
	private static int rectAX;
	private static int rectBX;
	private static int rectCX;
	private static int rectDX;
	private static int rectEX;
	private static int rectFX;
	
	private static int rectY;
	private static int rectYB;
	private static int rectYC;
	private static int rectYD;
	private static int rectYE;
	private static int rectYF;
	
	private static int rectWidth;
	private static int rectHeight;
	
	public int x,y,startX,startY,spaceX,spaceY;
	public Graphics graphics;
	private static Rectangle rectA;
	private static Rectangle rectB;
	private static Rectangle rectC;
	private static Rectangle rectD;
	private static Rectangle rectE;
	private static Rectangle rectF;
	private static Rectangle rectG;
	private static Rectangle rectButton1;
	private static Rectangle rectButton2;
	public Thread thread;
	
	private boolean stop;
	private boolean gameStarted;
	private boolean hover;
	private boolean hoverQ;

		
	private static int mX;
	private static int mY;
	private int player;
	
	private boolean win;
	
    /**
     *
     */
    public Image img;
	public Image img2;
	public Image img3;
        public Image img4;
	public ImageIcon icon;
	public ImageIcon icon2;
	public ImageIcon icon3;
        public ImageIcon icon4;
	
	public ConnectFourControl con;

	public ConnectFourPanel() throws InterruptedException{
		
		fX=40;
		fY=110;
		circleWidth = 39;
		circleHeight = 39;
		rectAX=13;
		rectBX=58;
		rectCX=103;
		rectDX=146;
		rectEX=190;
		rectFX=234;
		rectY=145;
		rectYB=194;
		rectYC=238;
		rectYD=282;
		rectYE=326;
		rectYF=370;
		rectWidth=94;
		rectHeight=35;
		
		rectY=145;
		this.setSize(400,520);
		this.setVisible(true);
		icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\image\\bwaka.png");
		icon2 = new ImageIcon("C:\\Users\\ASUS\\Desktop\\image\\character1.png");
                icon4 = new ImageIcon("C:\\Users\\ASUS\\Desktop\\image\\ame.jpg");
		icon3 = new ImageIcon("C:\\Users\\ASUS\\Desktop\\image\\character2.png");
		img = icon.getImage();
		img2 = icon2.getImage();
		img3 = icon3.getImage();
                img4 = icon4.getImage();
		con = new ConnectFourControl();
                
		rectButton1 = new Rectangle(40, 10, 133, 50);
		rectButton2 = new Rectangle(215, 10, 133, 50);
		rectA = new Rectangle(47, 367, 39, 39); 
		rectB = new Rectangle(92, 365, 39, 39);
		rectC = new Rectangle(133, 365, 39, 39);
		rectD = new Rectangle(179, 365, 39, 39);
		rectE = new Rectangle(223, 365, 39, 39);
		rectF = new Rectangle(268, 365, 39, 39);
		rectG = new Rectangle(310, 366, 39, 39);
		
		stop=false;
		gameStarted = false;
		hover=false;
		hoverQ=false;
	
		spaceX=-60;
		spaceY=300;
		
		this.setFocusable(true);
		this.requestFocus();
		addMouseListener(this);	
		addMouseMotionListener(this);
           
	}
	public void paint(Graphics g){
		 g.drawImage(img4, 1, 0, this);	
		
		if(con.cont[1][1]==0){
			g.setColor(Color.black); 
			g.fillOval(49, 146, 39, 39);
		}
		if(con.cont[1][1]==1){
			g.setColor(Color.yellow);
			g.fillOval(49, 146, 39, 39);
		}
		if(con.cont[1][1]==2){
			g.setColor(Color.red);
			g.fillOval(49, 146, 39, 39);
			System.out.println("red");
		}
		if(con.cont[1][2]==0){
			g.setColor(Color.black);
			g.fillOval(92, 147, 39, 39);
		}
		if(con.cont[1][2]==1){
			g.setColor(Color.yellow);
			g.fillOval(92, 147, 39, 39);
		}
		if(con.cont[1][2]==2){
			g.setColor(Color.red);
			g.fillOval(92, 145, 39, 39);
		}
		if(con.cont[1][3]==0){
			g.setColor(Color.black);
			g.fillOval(136, 147, 39, 39);
		}
		if(con.cont[1][3]==1){
			g.setColor(Color.yellow);
			g.fillOval(136, 147, 39, 39);
		}
		if(con.cont[1][3]==2){
			g.setColor(Color.red);
			g.fillOval(136, 147, 39, 39);
		}
		if(con.cont[1][4]==0){
			g.setColor(Color.black);
			g.fillOval(177, 147, 39, 39);
		}
		if(con.cont[1][4]==1){
			g.setColor(Color.yellow);
			g.fillOval(177, 147, 39, 39);
		}
		if(con.cont[1][4]==2){
			g.setColor(Color.red);
			g.fillOval(177, 147, 39, 39);
		}
		if(con.cont[1][5]==0){
			g.setColor(Color.black);
			g.fillOval(223, 147, 39, 39);
		}
		if(con.cont[1][5]==1){
			g.setColor(Color.yellow);
			g.fillOval(223, 147, 39, 39);
		}
		if(con.cont[1][5]==2){
			g.setColor(Color.red);
			g.fillOval(223, 147, 39, 39);
		}
		if(con.cont[1][6]==0){
			g.setColor(Color.black);
			g.fillOval(268, 147, 39, 39);
		}
		if(con.cont[1][6]==1){
			g.setColor(Color.yellow);
			g.fillOval(268, 147, 39, 39);
		}
		if(con.cont[1][6]==2){
			g.setColor(Color.red);
			g.fillOval(268, 147, 39, 39);
		}
		if(con.cont[1][7]==0){
			g.setColor(Color.black);
			g.fillOval(310, 147, 39, 39);
		}
		if(con.cont[1][7]==1){
			g.setColor(Color.yellow);
			g.fillOval(310, 147, 39, 39);
		}
		if(con.cont[1][7]==2){
			g.setColor(Color.red);
			g.fillOval(310, 147, 39, 39);    
		}
			 //row b
		if(con.cont[2][1]==0){
			g.setColor(Color.black);
			g.fillOval(47, 189, 39, 39);
		}
		if(con.cont[2][1]==1){
			g.setColor(Color.yellow);
			g.fillOval(47, 189, 39, 39);
		}
		if(con.cont[2][1]==2){
			g.setColor(Color.red);
			g.fillOval(47, 189, 39, 39);
		}
		if(con.cont[2][2]==0){
			g.setColor(Color.black);
			g.fillOval(90, 189, 39, 39);
		}
		if(con.cont[2][2]==1){
			g.setColor(Color.yellow);
			g.fillOval(90, 189, 39, 39);
		}
		if(con.cont[2][2]==2){
			g.setColor(Color.red);
			g.fillOval(90, 189, 39, 39);
		}
		if(con.cont[2][3]==0){
			g.setColor(Color.black);
			g.fillOval(136, 187, 39, 39);
		}
		if(con.cont[2][3]==1){
			g.setColor(Color.yellow);
			g.fillOval(136, 187, 39, 39);
		}
		if(con.cont[2][3]==2){
			g.setColor(Color.red);
			g.fillOval(136, 187, 39, 39);
		}
		if(con.cont[2][4]==0){
			g.setColor(Color.black);
			g.fillOval(179, 187, 39, 39);
		}
		if(con.cont[2][4]==1){
			g.setColor(Color.yellow);
			g.fillOval(179, 187, 39, 39);
		}
		if(con.cont[2][4]==2){
			g.setColor(Color.red);
			g.fillOval(179, 187, 39, 39);
		}
		if(con.cont[2][5]==0){
			g.setColor(Color.black);
			g.fillOval(223, 188, 39, 39);
		}
		if(con.cont[2][5]==1){
			g.setColor(Color.yellow);
			g.fillOval(223, 188, 39, 39);
		}
		if(con.cont[2][5]==2){
			g.setColor(Color.red);
			g.fillOval(223, 188, 39, 39);
		}
		if(con.cont[2][6]==0){
			g.setColor(Color.black);
			g.fillOval(268,188, 39, 39);
		}
		if(con.cont[2][6]==1){
			g.setColor(Color.yellow);
			g.fillOval(268,188, 39, 39);
		}
		if(con.cont[2][6]==2){
			g.setColor(Color.red);
			g.fillOval(268,188, 39, 39);
		}
		if(con.cont[2][7]==0){
			g.setColor(Color.black);
			g.fillOval(310,189, 39, 39);
		}
		if(con.cont[2][7]==1){
			g.setColor(Color.yellow);
			g.fillOval(310,189, 39, 39);
		}
		if(con.cont[2][7]==2){
			g.setColor(Color.red);
			g.fillOval(310,189, 39, 39);    		}
			
			// row c    
		if(con.cont[3][1]==0){
			g.setColor(Color.black);
			g.fillOval(47, 235, 39, 39);
		}
		if(con.cont[3][1]==1){
			g.setColor(Color.yellow);
			g.fillOval(47, 235, 39, 39);
		}
		if(con.cont[3][1]==2){
			g.setColor(Color.red);
			g.fillOval(47, 235, 39, 39);
		}
		if(con.cont[3][2]==0){
			g.setColor(Color.black);
			g.fillOval(90, 233, 39, 39);
		}
		if(con.cont[3][2]==1){
			g.setColor(Color.yellow);
			g.fillOval(90, 233, 39, 39);
		}
		if(con.cont[3][2]==2){
			g.setColor(Color.red);
			g.fillOval(90, 233, 39, 39);
		}
		if(con.cont[3][3]==0){
			g.setColor(Color.black);
			g.fillOval(136, 235, 39, 39);
		}
		if(con.cont[3][3]==1){
			g.setColor(Color.yellow);
			g.fillOval(136, 235, 39, 39);
		}
		if(con.cont[3][3]==2){
			g.setColor(Color.red);
			g.fillOval(136, 235, 39, 39);
		}
		if(con.cont[3][4]==0){
			g.setColor(Color.black);
			g.fillOval(179, 235, 39, 39);
		}
		if(con.cont[3][4]==1){
			g.setColor(Color.yellow);
			g.fillOval(179, 235, 39, 39);
		}
		if(con.cont[3][4]==2){
			g.setColor(Color.red);
			g.fillOval(179, 235, 39, 39);
		}
		if(con.cont[3][5]==0){
			g.setColor(Color.black);
			g.fillOval(223,235, 39, 39);
		}
		if(con.cont[3][5]==1){
			g.setColor(Color.yellow);
			g.fillOval(223,235, 39, 39);
		}
		if(con.cont[3][5]==2){
			g.setColor(Color.red);
			g.fillOval(223,235, 39, 39);
		}
		if(con.cont[3][6]==0){
			g.setColor(Color.black);
			g.fillOval(268,235, 39, 39);
		}
		if(con.cont[3][6]==1){
			g.setColor(Color.yellow);
			g.fillOval(268,235, 39, 39);
		}
		if(con.cont[3][6]==2){
			g.setColor(Color.red);
			g.fillOval(268,235, 39, 39);
		}
		if(con.cont[3][7]==0){
			g.setColor(Color.black);
			g.fillOval(310,236, 39, 39);
		}
		if(con.cont[3][7]==1){
			g.setColor(Color.yellow);
			g.fillOval(310,236, 39, 39);
		}
		if(con.cont[3][7]==2){
			g.setColor(Color.red);
			g.fillOval(310,236, 39, 39);   
		}	
			
			// row d    
		if(con.cont[4][1]==0){
			g.setColor(Color.black);
			g.fillOval(47, 277, 39, 39);
		}
		if(con.cont[4][1]==1){
			g.setColor(Color.yellow);
			g.fillOval(47, 277, 39, 39);
		}
		if(con.cont[4][1]==2){
			g.setColor(Color.red);
			g.fillOval(47, 277, 39, 39);
		}
		if(con.cont[4][2]==0){
			g.setColor(Color.black);
			g.fillOval(90, 277, 39, 39);
		}
		if(con.cont[4][2]==1){
			g.setColor(Color.yellow);
			g.fillOval(90, 277, 39, 39);
		}
		if(con.cont[4][2]==2){
			g.setColor(Color.red);
			g.fillOval(90, 277, 39, 39);
		}
		if(con.cont[4][3]==0){
			g.setColor(Color.black);
			g.fillOval(133, 277, 39, 39);
		}
		if(con.cont[4][3]==1){
			g.setColor(Color.yellow);
			g.fillOval(133, 277, 39, 39);
		}
		if(con.cont[4][3]==2){
			g.setColor(Color.red);
			g.fillOval(133, 277, 39, 39);
		}
		if(con.cont[4][4]==0){
			g.setColor(Color.black);
			g.fillOval(179, 279, 39, 39);
		}
		if(con.cont[4][4]==1){
			g.setColor(Color.yellow);
			g.fillOval(179, 279, 39, 39);
		}
		if(con.cont[4][4]==2){
			g.setColor(Color.red);
			g.fillOval(179, 279, 39, 39);
		}
		if(con.cont[4][5]==0){
			g.setColor(Color.black);
			g.fillOval(223, 279, 39, 39);
		}
		if(con.cont[4][5]==1){
			g.setColor(Color.yellow);
			g.fillOval(223, 279, 39, 39);
		}
		if(con.cont[4][5]==2){
			g.setColor(Color.red);
			g.fillOval(223, 279, 39, 39);
		}
		if(con.cont[4][6]==0){
			g.setColor(Color.black);
			g.fillOval(268, 278, 39, 39);
		}
		if(con.cont[4][6]==1){
			g.setColor(Color.yellow);
			g.fillOval(268, 278, 39, 39);
		}
		if(con.cont[4][6]==2){
			g.setColor(Color.red);
			g.fillOval(268, 278, 39, 39);
		}
		if(con.cont[4][7]==0){
			g.setColor(Color.black);
			g.fillOval(310, 277, 39, 39);
		}
		if(con.cont[4][7]==1){
			g.setColor(Color.yellow);
			g.fillOval(310, 277, 39, 39);
		}
		if(con.cont[4][7]==2){
			g.setColor(Color.red);
			g.fillOval(310, 277, 39, 39);  
		}
			
			//row e      
		if(con.cont[5][1]==0){
			g.setColor(Color.black);
			g.fillOval(47,322, 39, 39);
		}
		if(con.cont[5][1]==1){
			g.setColor(Color.yellow);
			g.fillOval(47,322, 39, 39);
		}
		if(con.cont[5][1]==2){
			g.setColor(Color.red);
			g.fillOval(47,322, 39, 39);
		}
		if(con.cont[5][2]==0){
			g.setColor(Color.black);
			g.fillOval(90,322, 39, 39);
		}
		if(con.cont[5][2]==1){
			g.setColor(Color.yellow);
			g.fillOval(90,322, 39, 39);
		}
		if(con.cont[5][2]==2){
			g.setColor(Color.red);
			g.fillOval(90,322, 39, 39);
		}
		if(con.cont[5][3]==0){
			g.setColor(Color.black);
			g.fillOval(133, 322, 39, 39);
		}
		if(con.cont[5][3]==1){
			g.setColor(Color.yellow);
			g.fillOval(133, 322, 39, 39);
		}
		if(con.cont[5][3]==2){
			g.setColor(Color.red);
			g.fillOval(133, 322, 39, 39);
		}
		if(con.cont[5][4]==0){
			g.setColor(Color.black);
			g.fillOval(179, 322, 39, 39);
		}
		if(con.cont[5][4]==1){
			g.setColor(Color.yellow);
			g.fillOval(179, 322, 39, 39);
		}
		if(con.cont[5][4]==2){
			g.setColor(Color.red);
			g.fillOval(179, 322, 39, 39);
		}
		if(con.cont[5][5]==0){
			g.setColor(Color.black);
			g.fillOval(223, 322, 39, 39);
		}
		if(con.cont[5][5]==1){
			g.setColor(Color.yellow);
			g.fillOval(223, 322, 39, 39);
		}
		if(con.cont[5][5]==2){
			g.setColor(Color.red);
			g.fillOval(223, 322, 39, 39);
		}
		if(con.cont[5][6]==0){
			g.setColor(Color.black);
			g.fillOval(268, 320, 39, 39);
		}
		if(con.cont[5][6]==1){
			g.setColor(Color.yellow);
			g.fillOval(268, 320, 39, 39);
		}
		if(con.cont[5][6]==2){
			g.setColor(Color.red);
			g.fillOval(268, 320, 39, 39);
		}
		if(con.cont[5][7]==0){
			g.setColor(Color.black);
			g.fillOval(310, 323, 39, 39);
		}
		if(con.cont[5][7]==1){
			g.setColor(Color.yellow);
			g.fillOval(310, 323, 39, 39);
		}
		if(con.cont[5][7]==2){
			g.setColor(Color.red);
			g.fillOval(310, 323, 39, 39);    
		}
			
			//row f      
               
		if(con.cont[6][1]==0){
			g.setColor(Color.black);
			g.fillOval(47, 367, 39, 39);
		}
		if(con.cont[6][1]==1){
			g.setColor(Color.yellow);
			g.fillOval(47, 367, 39, 39);
		}
		if(con.cont[6][1]==2){
			g.setColor(Color.red);
			g.fillOval(47, 367, 39, 39);
		}
		if(con.cont[6][2]==0){
			g.setColor(Color.black);
			g.fillOval(92, 365, 39, 39);
		}
		if(con.cont[6][2]==1){
			g.setColor(Color.yellow);
			g.fillOval(92, 365, 39, 39);
		}
		if(con.cont[6][2]==2){
			g.setColor(Color.red);
			g.fillOval(92, 365, 39, 39);
		}
		if(con.cont[6][3]==0){
			g.setColor(Color.black);
			g.fillOval(133, 365, 39, 39);
		}
		if(con.cont[6][3]==1){
			g.setColor(Color.yellow);
			g.fillOval(133, 365, 39, 39);
		}
		if(con.cont[6][3]==2){
			g.setColor(Color.red);
			g.fillOval(133, 365, 39, 39);
		}
		if(con.cont[6][4]==0){
			g.setColor(Color.black);
			g.fillOval(179,365,39,39);
		}
		if(con.cont[6][4]==1){
			g.setColor(Color.yellow);
			g.fillOval(179,365,39,39);
		}
		if(con.cont[6][4]==2){
			g.setColor(Color.red);
			g.fillOval(179,365,39,39);
		}
		if(con.cont[6][5]==0){
			g.setColor(Color.black);
			g.fillOval(223, 365, 39, 39);
		}
		if(con.cont[6][5]==1){
			g.setColor(Color.yellow);
			g.fillOval(223, 365, 39, 39);
		}
		if(con.cont[6][5]==2){
			g.setColor(Color.red);
			g.fillOval(223, 365, 39, 39);
		}
		if(con.cont[6][6]==0){
			g.setColor(Color.black);
			g.fillOval(265, 365, 39, 39);
		}
		if(con.cont[6][6]==1){
			g.setColor(Color.yellow);
			g.fillOval(265, 365, 39, 39);
		}
		if(con.cont[6][6]==2){
			g.setColor(Color.red);
			g.fillOval(265, 365, 39, 39);
		}
		if(con.cont[6][7]==0){
			g.setColor(Color.black);
			g.fillOval(310, 366, 39, 39);
		}
		if(con.cont[6][7]==1){
			g.setColor(Color.yellow);
			g.fillOval(310, 366, 39, 39);
		}
		if(con.cont[6][7]==2){
			g.setColor(Color.red);
			g.fillOval(310, 366, 39, 39);    //62
		}
		
               
		g.drawImage(img, 45, 143, this);
               
		
		if(gameStarted==false){
			g.drawImage(img3, 50, 149, this);
		}	
		
			
		if(!hover)
			g.setColor(Color.black);
		else
			g.setColor(Color.cyan);
		g.fillRect(40, 10, 133, 50);
		g.setFont(new Font("Monospaced",Font.BOLD,14));
		if(!hoverQ)
			g.setColor(Color.black);
		else
			g.setColor(Color.cyan);
		g.fillRect(215, 10, 133, 50);
		g.setColor(Color.cyan);
		g.drawString("CITCS 1-E!", 10, 420);  
                
                
		g.setColor(Color.white);
                g.setFont(new Font("Century Gothic",Font.BOLD,18));
		g.drawString(" New Game ", 49, 40);
		g.drawString(" Exit Game ", 231, 40);
		
		if(gameStarted==true){
		if(con.getWin() == true){
			player=con.getPlayer();
			g.setFont(new Font("Verdana",Font.BOLD,22));
			stop=true;
			if(player==1){
				g.setColor(Color.yellow);
				g.drawImage(img2, 70, 155, this);
                                g.setColor(Color.black);
				g.drawString("CONGRATULATIONS!", 7, 100);
                                g.drawString("CONGRATULATIONS!", 20, 130);
                                g.setColor(Color.yellow);
                                g.drawString("PLAYER YELLOW", 110, 440);
				g.setFont(new Font("Verdana",Font.BOLD,26));
                                g.setColor(Color.red);
				g.drawString("BETTER LUCK NEXT TIME!", 8, 470);
							}
			if(player==2){
				g.setColor(Color.black);
				g.drawImage(img3, 70, 155, this);
                                g.setFont(new Font("Verdana",Font.BOLD,22));
				g.drawString("CONGRATULATIONS!", 7, 100);
                                g.drawString("CONGRATULATIONS!", 20, 130);
                                g.setColor(Color.pink);
                                g.drawString("PLAYER RED", 110, 429);
				g.setFont(new Font("Verdana",Font.BOLD,26));
                                g.setColor(Color.yellow);
				g.drawString("BETTER LUCK NEXT TIME!", 8, 460);
			}
		}else if(player==1){
			g.setColor(Color.red);
			g.setFont(new Font("Georgia",Font.BOLD,26));
			g.drawString(" RED TURN ", 46, 470);
		}else if(player==2){
			g.setColor(Color.yellow);
			g.setFont(new Font("Georgia",Font.BOLD,30));
			g.drawString("YELLOW TURN", 29, 470);
		}
		}
		g.dispose();
}
	
	@Override
	public void mouseClicked(MouseEvent e) {

		player=con.getPlayer();
                
		if(stop==false){
			if(gameStarted == true){
				
		mX = e.getX();
		mY = e.getY();
      
		if(mX > rectA.x && mX < rectA.x + rectA.width && mY > rectA.y && mY < rectA.y + rectA.height){
	
			x=13;
			y=238;
			//col 1
			
			if(player==2){
				player=1;
				con.setPlayer(player);
			}
			else{
				player=2;
				con.setPlayer(player);
			}
			
			con.checkCol1();
		
			repaint();
			con.win();
		}
		if(mX > rectB.x && mX < rectB.x + rectB.width && mY > rectB.y && mY < rectB.y + rectB.height){
		
			x=58;
			y=238;
			//col 2
			if(player==1){
				player=2;
				con.setPlayer(player);
			}
			else{
				player=1;
				con.setPlayer(player);
			}
			con.checkCol2();
			repaint();
			con.win();
		}
		if(mX > rectC.x && mX < rectC.x + rectC.width && mY > rectC.y && mY < rectC.y + rectC.height){

			x=105;
			y=238;
			if(player==1){
				player=2;
				con.setPlayer(player);
			}
			else{
				player=1;
				con.setPlayer(player);
			}
			con.checkCol3();
			repaint();
			//col 3
			con.win();
		}
		if(mX > rectD.x && mX < rectD.x + rectD.width && mY > rectD.y && mY < rectD.y + rectD.height){//collision detection
	
			x=146;
			y=238;
			//col 4
			if(player==1){
				player=2;
				con.setPlayer(player);
			}
			else{
				player=1;
				con.setPlayer(player);
			}
			con.checkCol4();
			repaint();
			con.win();
		}
		if(mX > rectE.x && mX < rectE.x + rectE.width && mY > rectE.y && mY < rectE.y + rectE.height){
			
			x=190;
			y=238;
			if(player==1){
				player=2;
				con.setPlayer(player);
			}
			else{
				player=1;
				con.setPlayer(player);
			}
			con.checkCol5();
			repaint();
			//col 5
			con.win();
		}
		if(mX > rectF.x && mX < rectF.x + rectF.width && mY > rectF.y && mY < rectF.y + rectF.height){
	
			x=234;
			y=238;
			if(player==1){
				player=2;
				con.setPlayer(player);
			}
			else{
				player=1;
				con.setPlayer(player);
			}
			con.checkCol6();
			repaint();
			//col 6
			con.win();
		}
		if(mX > rectG.x && mX < rectG.x + rectG.width && mY > rectG.y && mY < rectG.y + rectG.height){
			
			x=313;
                        y=388;
                        
                        
                        
			if(player==1){
				player=2;
				con.setPlayer(player);
			}
			else{
				player=1;
				con.setPlayer(player);
			}
			con.checkCol7();
			repaint();
			//col 7
			con.win();
		}
		}
		}
		startX=e.getX();
		startY=e.getY();
		if(startX > rectButton1.x && startX < rectButton1.x+rectButton1.width&& startY > rectButton1.y && startY <rectButton1.y +rectButton1.height )
		{gameStarted=true;	
			if(gameStarted==true || stop==true){
				stop=false;
			for(int row=1;row<7;row++){
				
				for(int col=1;col<8;col++){
					con.cont[row][col]=0;
				
				}
				
	
				this.win=false;
				con.setWin(this.win);

				repaint();
		}
			}
		}
		if(startX > rectButton2.x && startX< rectButton2.x+rectButton2.width && startY > rectButton2.y && startY < rectButton2.y +rectButton2.height ){
			System.exit(1);
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
	
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
	
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}
	@Override
	public void mouseMoved(MouseEvent em) {//mousedmoved implemente from the abstract classed for the mouse listeners with
	
		int startX=em.getX();
		int startY=em.getY();
		if(startX > rectButton1.x && startX< rectButton1.x+rectButton1.width && startY > rectButton1.y && startY < rectButton1.y +rectButton1.height ){
			hover=true;
			
			repaint();
		}
		else{
			hover=false;
			repaint();
		}
		if(startX > rectButton2.x && startX< rectButton2.x+rectButton2.width && startY > rectButton2.y && startY < rectButton2.y +rectButton2.height ){
			hoverQ=true;
			repaint();
		}
		else{
			hoverQ=false;
			repaint();
		}
	}
	
	public void draw(Graphics g){
		
	}
	
	
	
	
}
