import java.awt.*;
public class Poly extends applet
{
int x1[]={20,120,220,20};
int x2[]={120,220,220,120};
int y1[]={20,120,220,20};
int y2[]={120,220,220,120};
int n1=4;
int n2=4;
public void Paint(Graphics g)
{
g.drawPolygon(x1,y1,n1);
g.fillPolygon(x2,y2,n2);
}
}