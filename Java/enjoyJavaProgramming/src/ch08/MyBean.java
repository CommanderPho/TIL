package ch08;

public class MyBean implements BeanInterface
{
	/* (non-Javadoc)
	 * @see ch8.BeanInterface#exec()
	 */
	@Override
	public void exec()
	{
		System.out.println("exec");
	}
}

//interface ����  ����Ŭ��������
//Refactor -> Extract interface
