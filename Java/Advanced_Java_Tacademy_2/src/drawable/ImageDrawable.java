package drawable;

import java.io.PrintStream;
import annotation.Enemy;
import shape.Shape;

@Enemy
public class ImageDrawable extends AbstractDrawable
{

	Image image;
	
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	@Override
	public void draw(PrintStream out)
	{
		out.println("Position : " + getXY());
		out.println("image : " + image);
	}

	@Override
	public void onPositionChanged(int x, int y)
	{
//		System.out.printf("%d,%d���� ��ġ �ٲ�",x,y);
	}

}
