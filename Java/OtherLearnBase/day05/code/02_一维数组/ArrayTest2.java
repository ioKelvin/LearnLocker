/*
	�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)

	��ѧ����Сֵ��
*/
class ArrayTest2 {
	public static void main(String[] args) {
		//��������
		int[] arr = {12,86,79,43,50,32,3232,4,4,4,4,4,4,99,4,1,312,32,7,90,5,34564,0,87,97,9,65,65,545};

		//�������?
		/*
		int max = arr[0];

		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}

		System.out.println(max);
		*/

		System.out.println(arr.length);
		System.out.println("_____________________");
		//Ϊ�˽������÷��㣬����дһ������ʵ�ֻ�ȡ��ֵ
		int max = getMax(arr);
		System.out.println("���ֵ�ǣ�"+max);
		
		System.out.println("MinNum is"+getMin(arr));
	}

	/*
		����ֵ���ͣ�int
		�����б�int[] arr
	*/
	public static int getMax(int[] arr) {
		//���������
		int max = arr[0];

		//ѭ��������1��ʼԪ��
		for(int x=1; x<arr.length; x++) {
			//�Ƚϣ��Ѵ��������
			if(arr[x] > max) {
				max = arr[x];
			}
		}

		//�������ֵ
		return max;
	}
	
	public static int getMin(int[] arr)
	{
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		return min;
	}
}
