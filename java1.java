import java.awt.*;

class java1 extends Frame {
		static int x=0, y=120;
		static int i=0;
		static int horizScroll=1;

		Font fb = new Font("TimesRoman", Font.BOLD, 36);
		String msg[]={"Java", "Portable", "Secure", "Easy"};
		Color color[]={Color.blue, Color.yellow, Color.green, Color.red};
		public void paint(Graphics g) {
			g.setFont( fb );
			g.setColor( color[i] );
			g.drawString(msg[i],x,y);
		}

		static public void main(String s[]) throws Exception {
			java1 mf = new java1();
			mf.setSize(200,200);
			int pixelsPerLine=200, totalLines=4;
			mf.setVisible(true);
			for (int j = 0; j < pixelsPerLine*totalLines; j++) {
				Thread.sleep(25);
				mf.repaint();
				if (horizScroll == 1) {
					if ( (x+=3) < 200) continue;
					i = ++i % 4;
					x=50; y=0; horizScroll=0;
				} else {
					if ( (y+=3) < 200) continue;
					i = ++i % 4;
					x=0; y=120;
				}
			}
			System.exit(0);
		}
}

