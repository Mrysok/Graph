import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author user
 *
 */
public class MyPanel3 extends JPanel {
	double x1=0,y1=0,x2=0,y2=0,_x1=0,_x2=0,_y1=0,_y2=0;
	double x3=0,y3=0,x4=0,y4=0,_x3=0,_x4=0,_y3=0,_y4=0;
	int xCentr=250, yCentr=300, Size=25;
	double Rx1,Ry1, Ey1, Ex1;
	double Lx1, Ly1, Ld1;
	double Px1, Py1;
	double Gx1, Gy1;
	double[][] arr = new double[25][5];
	

public void paint(Graphics g){
	super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
	funcO(g);
	for(int i=0;i<25;i++){
		switch(i){
		case 0:
			g.setColor(Color.black);
			break;
		case 1:
			g.setColor(Color.red);
			break;
		case 2:
			g.setColor(Color.orange);
			break;
		case 3:
			g.setColor(Color.magenta);
			break;
		case 4:
			g.setColor(Color.green);
			break;
		case 5:
			g.setColor(Color.cyan);
			break;
		case 6:
			g.setColor(Color.BLUE);
			break;
		case 7:
			g.setColor(Color.gray);
			break;
		case 8:
			g.setColor(Color.pink);
			break;
		}
	if(arr[i][0]==1){
		
		funcLine(g, arr[i][1], arr[i][2],arr[i][3]);	
	}
	if(arr[i][0]==2){
		funcPar(g, arr[i][1], arr[i][2], arr[i][3], arr[i][4]);
	}
	if(arr[i][0]==3){
		funcGip(g, arr[i][1], arr[i][2], arr[i][3], arr[i][4]);
	}
	if(arr[i][0]==4){
		funcElips(g, arr[i][1],arr[i][2],arr[i][3],arr[i][4]);
	}
	if(arr[i][0]==5){
		funcGip1(g, arr[i][1],arr[i][2]);
	}
	}}
	
void funcO(Graphics g){
	int xx2=50,xy2=305,xx1=50,xy1=295;
	int yx2=245,yy2=50,yx1=255,yy1=50;
	for(int i = 0; i <= 12; i ++){
		g.drawLine(xx1-25, xy1+2, xx2-25, xy2-2);
		g.drawLine(xx1, xy1-2, xx2, xy2+2);
		xx2=xx2+50;
		xx1=xx2;
		
		g.drawLine(yx1+2, yy1, yx2-2, yy2);
		g.drawLine(yx1-2, yy1-25, yx2+2, yy2-25);
		yy2=yy2+50;
		yy1=yy2;
	}
	g.setColor(Color.BLACK);
	g.drawString("x", 490, 315);
	g.drawLine(0, 300, 500, 300);
	g.drawLine(500, 300, 490, 295);
	g.drawLine(500, 300, 490, 305);
	
	g.drawString("y", 257, 12);
	g.drawLine(250, 0, 250, 600);
	g.drawLine(250, 0, 245, 10);
	g.drawLine(250, 0, 255, 10);
}

void funcElips(Graphics g,double Rx,double Ry,double Ey,double Ex)
 {  
 	x3=0;y3=0;x4=0;y4=0;_x3=0;_x4=0;_y3=0;_y4=0;
 	x1=0;y1=0;x2=0;y2=0;_x1=0;_x2=0;_y1=0;_y2=0;
	
	for(double i=0; i <= 0.0005;i = i+0.00000002){		
		 y2 =Math.sqrt(Rx*Rx-((Rx*Rx)/(Ry*Ry))*((x2+Ex)*(x2+Ex)))+Ey; 
		 y2 = 0 - y2;
		 x2 = x2 + i;
		
		_y2 =Math.sqrt(Rx*Rx-((Rx*Rx)/(Ry*Ry))*((_x2+Ex)*(_x2+Ex)))+Ey; 
		_y2 = 0 - _y2;
		_x2 = _x2 - i;
		
		 y4 =-Math.sqrt(Rx*Rx-((Rx*Rx)/(Ry*Ry))*((x4+Ex)*(x4+Ex)))+Ey; ; 
		 y4 = 0 - y4;
		 x4 = x4 + i;
		
		_y4 =-Math.sqrt(Rx*Rx-((Rx*Rx)/(Ry*Ry))*((_x4+Ex)*(_x4+Ex)))+Ey; ; 
		_y4 = 0 - _y4;
		_x4 = _x4 - i; 
		if(y2>0){
			if(y1>0){
		g.drawLine((int) (x1*Size+xCentr), (int)(y1*Size+yCentr), (int)(x2*Size+xCentr), (int)(y2*Size+yCentr));
		g.drawLine((int) (x3*Size+xCentr), (int)(y3*Size+yCentr), (int)(x4*Size+xCentr), (int)(y4*Size+yCentr));
		}}
		if(y2<0){
			if(y1<0){
		g.drawLine((int) (x1*Size+xCentr), (int)(y1*Size+yCentr), (int)(x2*Size+xCentr), (int)(y2*Size+yCentr));
		g.drawLine((int) (x3*Size+xCentr), (int)(y3*Size+yCentr), (int)(x4*Size+xCentr), (int)(y4*Size+yCentr));
		}}
		if(_y2>0){
			if(_y1>0){
		g.drawLine((int) (_x1*Size+xCentr), (int)(_y1*Size+yCentr), (int)(_x2*Size+xCentr), (int)(_y2*Size+yCentr));
		g.drawLine((int) (_x3*Size+xCentr), (int)(_y3*Size+yCentr), (int)(_x4*Size+xCentr), (int)(_y4*Size+yCentr));
			}}
		if(_y2<0){
			if(_y1<0){
		g.drawLine((int) (_x1*Size+xCentr), (int)(_y1*Size+yCentr), (int)(_x2*Size+xCentr), (int)(_y2*Size+yCentr));
		g.drawLine((int) (_x3*Size+xCentr), (int)(_y3*Size+yCentr), (int)(_x4*Size+xCentr), (int)(_y4*Size+yCentr));
			}}
		
		 x1 = x2;
		 y1 = y2;
		_y1 = _y2;
		_x1 = _x2;
		 x3 = x4;
		 y3 = y4;
		_y3 = _y4;
		_x3 = _x4;
		
	}}
		
void funcLine(Graphics g,double Lx,double Ly,double Ld){

	
	x1=0;y1=0;x2=0;y2=0;_x1=0;_x2=0;_y1=0;_y2=0;
	
	for(double i=0; i <= 1;i = i+0.0001){		
		 y2 =(Lx*x2+Ly)/Ld; 
		 y2 = 0 - y2;
		 x2 = x2 + i;
		
		_y2 =(Lx*_x2+Ly)/Ld;
		_y2 = 0 - _y2;
		_x2 = _x2 - i;
		
		
		
		if(i==0){
			   x1 =  x2;
			   y1 =  y2;
			  _x1 = _x2;
			  _y1 = _y2;
			
			}
		
		if(y2<15){
		g.drawLine((int) (x1*Size+xCentr), (int)(y1*Size+yCentr), (int)(x2*Size+xCentr), (int)(y2*Size+yCentr));
		g.drawLine((int) (_x1*Size+xCentr), (int)(_y1*Size+yCentr), (int)(_x2*Size+xCentr), (int)(_y2*Size+yCentr));
		
		
		 x1 = x2;
		 y1 = y2;
		_y1 = _y2;
		_x1 = _x2;
	
		}
	}	
}
		
void funcPar(Graphics g,double Px,double Py,double Pp,double Z){

	x1=0;y1=0;x2=0;y2=0;_x1=0;_x2=0;_y1=0;_y2=0;
	double sq;
		if(Z==1){
			for(double i=0; i <= 1;i = i+0.00001){		
				y2 =Pp*((x2+Px)*(x2+Px))+Py;
				y2 = 0 - y2;
				x2 = x2 + i;
			
				_y2 =Pp*((_x2+Px)*(_x2+Px))+Py;
				_y2 = 0 - _y2;
				_x2 = _x2 - i;
			
			
			
				if(i==0){
					x1 =  x2;
					y1 =  y2;
				   _x1 = _x2;
				   _y1 = _y2;
					}
				sq=y2-y1;
				if(Math.abs(sq)<1){
					g.drawLine((int) (x1*Size+xCentr), (int)(y1*Size+yCentr), (int)(x2*Size+xCentr), (int)(y2*Size+yCentr));
					g.drawLine((int) (_x1*Size+xCentr), (int)(_y1*Size+yCentr), (int)(_x2*Size+xCentr), (int)(_y2*Size+yCentr));

					x1 = x2;
					y1 = y2;
					_y1 = _y2;
					_x1 = _x2;
				}
			}	
		}else{
			for(double i=0; i <= 1;i = i+0.00001){		
				y2 =Pp*((x2+Px)*(x2+Px))+Py;
				y2 = 0 - y2;
				x2 = x2 + i;
			
				_y2 =Pp*((_x2+Px)*(_x2+Px))+Py;
				_y2 = 0 - _y2;
				_x2 = _x2 - i;
			
			
			
				if(i==0){
					x1 =  x2;
					y1 =  y2;
				   _x1 = _x2;
				   _y1 = _y2;
					}
				sq=y2-y1;
				if(Math.abs(sq)<1){
					g.drawLine((int) (y1*Size+xCentr), (int)(x1*Size+yCentr), (int)(y2*Size+xCentr), (int)(x2*Size+yCentr));
					g.drawLine((int) (_y1*Size+xCentr), (int)(_x1*Size+yCentr), (int)(_y2*Size+xCentr), (int)(_x2*Size+yCentr));
				}
					x1 = x2;
					y1 = y2;
					_y1 = _y2;
					_x1 = _x2;
				}
			}
		}

			
void funcGip(Graphics g,double Gx,double Gy,double Px,double Py)
{
			
			double sq;
			x1=0;y1=0;x2=0;y2=0;_x1=0;_x2=0;_y1=0;_y2=0;
			x3=0;y3=0;x4=0;y4=0;_x3=0;_x4=0;_y3=0;_y4=0;
			
		
			for(double i=0; i <= 0.005;i = i+0.0000001){		
				// y2 = 1/(x2+Gx)+Gy;
				 y2 = Math.sqrt(((x2-Px)*(x2-Px))/(Gx*Gx)*(Gy*Gy)-Gy*Gy)+Py;
				 y2 = 0 - y2;
				 x2 = x2 + i;
				
		
				 _y2 = Math.sqrt(((_x2-Px)*(_x2-Px))/(Gx*Gx)*(Gy*Gy)-Gy*Gy)+Py;
				_y2 = 0 - _y2;
				_x2 = _x2 - i;
				
				y4 =-Math.sqrt(((x4-Px)*(x4-Px))/(Gx*Gx)*(Gy*Gy)-Gy*Gy)+Py;
				 y4 = 0 - y4;
				 x4 = x4 + i;
				
				_y4 =-Math.sqrt(((_x4-Px)*(_x4-Px))/(Gx*Gx)*(Gy*Gy)-Gy*Gy)+Py;
				_y4 = 0 - _y4;
				_x4 = _x4 - i; 
				
				sq=y2-y1;
				if(Math.abs(sq)<1){
					g.drawLine((int) (x1*Size+xCentr),  (int)(y1*Size+yCentr),  (int)(x2*Size+xCentr),  (int)(y2*Size+yCentr));
					g.drawLine((int) (x3*Size+xCentr), (int)(y3*Size+yCentr), (int)(x4*Size+xCentr), (int)(y4*Size+yCentr));
				}

				sq=_y2-_y1;
				if(Math.abs(sq)<1){
				g.drawLine((int) (_x1*Size+xCentr), (int)(_y1*Size+yCentr), (int)(_x2*Size+xCentr), (int)(_y2*Size+yCentr));
				g.drawLine((int) (_x3*Size+xCentr), (int)(_y3*Size+yCentr), (int)(_x4*Size+xCentr), (int)(_y4*Size+yCentr));}
				
				
				
			
				 x1 = x2;
				 y1 = y2;
				_y1 = _y2;
				_x1 = _x2;	
				 x3 = x4;
				 y3 = y4;
				_y3 = _y4;
				_x3 = _x4;
			}
	
}

void funcGip1(Graphics g,double Gx,double Gy)
{
			
			double sq;
			x1=0;y1=0;x2=0;y2=0;_x1=0;_x2=0;_y1=0;_y2=0;
			
		
			for(double i=0; i <= 6;i = i+0.00001){		
				 y2 = 1/(x2+Gx)+Gy;
				 y2 = 0 - y2;
				 x2 = x2 + i;
				
				_y2 =1/(_x2+Gx)+Gy;
				_y2 = 0 - _y2;
				_x2 = _x2 - i;
				
				sq=y2-y1;
				if(Math.abs(sq)<1){
					g.drawLine((int) (x1*Size+xCentr),  (int)(y1*Size+yCentr),  (int)(x2*Size+xCentr),  (int)(y2*Size+yCentr));
					
				}

				sq=_y2-_y1;
				if(Math.abs(sq)<1){
				g.drawLine((int) (_x1*Size+xCentr), (int)(_y1*Size+yCentr), (int)(_x2*Size+xCentr), (int)(_y2*Size+yCentr));}
				
				
				
			
				 x1 = x2;
				 y1 = y2;
				_y1 = _y2;
				_x1 = _x2;	
				
			}
	
}



public void setLine1(int p,double s,double z,double a) {
	this.arr[p][0] = 1;
	this.arr[p][1] = s;
	this.arr[p][2] = z;
	this.arr[p][3] = a;
}

public void setPar1(int p,double s,double z,double q,double g) {
	this.arr[p][0] = 2;
	this.arr[p][1] = s;
	this.arr[p][2] = z;
	this.arr[p][3] = q;
	this.arr[p][4] = g;
}

public void setGip1(int p,double s,double z,double q,double a) {
	this.arr[p][0] = 3;
	this.arr[p][1] = s;
	this.arr[p][2] = z;
	this.arr[p][3] = q;
	this.arr[p][4] = a;
}

public void setGip2(int p,double s,double z) {
	this.arr[p][0] = 5;
	this.arr[p][1] = s;
	this.arr[p][2] = z;
}

public void setEll1(int p,double s,double z,double q,double w) {
	this.arr[p][0] = 4;
	this.arr[p][1] = s;
	this.arr[p][2] = z;
	this.arr[p][3] = q;
	this.arr[p][4] = w;
}

public void setNull(){
	for(int i=0;i<25;i++){
		for(int j=0;j<5;j++){
			arr[i][j]=0;
		}
	}
}
}
