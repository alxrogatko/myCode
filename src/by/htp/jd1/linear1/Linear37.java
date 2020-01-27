package by.htp.jd1.linear1;

import java.util.Scanner;

public class Linear37 {
	public static void main(String[] args) {

		/*
		 *  Öĺëîĺ ÷čńëî N ˙âë˙ĺňń˙ ÷ĺňíűě äâóçíŕ÷íűě ÷čńëîě. • Ńóěěŕ äâóő ďĺđâűő öčôđ
		 * çŕäŕííîăî ÷ĺňűđĺőçíŕ÷íîăî ÷čńëŕ đŕâíŕ ńóěěĺ äâóő ĺăî ďîńëĺäíčő öčôđ. • Ńóěěŕ
		 * öčôđ äŕííîăî ňđĺőçíŕ÷íîăî ÷čńëŕ N ˙âë˙ĺňń˙ ÷ĺňíűě ÷čńëîě. • Ňî÷ęŕ ń
		 * ęîîđäčíŕňŕěč (ő, ó) ďđčíŕäëĺćčň ÷ŕńňč ďëîńęîńňč, ëĺćŕůĺé ěĺćäó ďđ˙ěűěč ő= ň,
		 * ő= ď (ň<ď). • Ęâŕäđŕň çŕäŕííîăî ňđĺőçíŕ÷íîăî ÷čńëŕ đŕâĺí ęóáó ńóěěű öčôđ
		 * ýňîăî ÷čńëŕ. • Ňđĺóăîëüíčę ńî ńňîđîíŕěč ŕ,b,ń ˙âë˙ĺňń˙ đŕâíîáĺäđĺííűě. •
		 * Ńóěěŕ ęŕęčő-ëčáî äâóő öčôđ çŕäŕííîăî ňđĺőçíŕ÷íîăî íŕňóđŕëüíîăî ÷čńëŕ N đŕâíŕ
		 * ňđĺňüĺé öčôđĺ. • Çŕäŕííîĺ ÷čńëî N ˙âë˙ĺňń˙ ńňĺďĺíüţ ÷čńëŕ ŕ (ďîęŕçŕňĺëü
		 * ńňĺďĺíč ěîćĺň íŕőîäčňüń˙ â äčŕďŕçîíĺ îň 0 äî 4). • Ăđŕôčę ôóíęöčč ó = ŕő2 +
		 * bő+ ń ďđîőîäčň ÷ĺđĺç çŕäŕííóţ ňî÷ęó ń ęîîđäčíŕňŕěč (m, n).
		 */
		Scanner scn = new Scanner(System.in);

		sPo("Öĺëîĺ ÷čńëî N ˙âë˙ĺňń˙ ÷ĺňíűě äâóçíŕ÷íűě ÷čńëîě: ");
		sPo("Ââĺäčňĺ ÷čńëî");
		double a1 = scn.nextDouble();
		if (a1 % 2 == 0 && a1 < 100 && a1 > 9) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Ńóěěŕ äâóő ďĺđâűő öčôđ çŕäŕííîăî ÷ĺňűđĺőçíŕ÷íîăî ÷čńëŕ đŕâíŕ ńóěěĺ äâóő ĺăî ďîńëĺäíčő öčôđ: ");
		sPo("Ââĺäčňĺ ÷ĺňűđĺőçíŕ÷íîĺ ÷čńëî");
		int a2 = scn.nextInt();
		int sum1;
		int sum2;
		sum1 = a2 % 10 + ((a2 / 10) % 10);
		sum2 = (a2 / 100) % 10 + ((a2 / 1000) % 10);
		if (sum1 == sum2) {
			printTrue();
		} else {
			printFalse();
		}
		sPo(" Ńóěěŕ öčôđ äŕííîăî ňđĺőçíŕ÷íîăî ÷čńëŕ N ˙âë˙ĺňń˙ ÷ĺňíűě ÷čńëîě: ");
		sPo("Ââĺäčňĺ ňđĺőçíŕ÷íîĺ ÷čńëî");
		int n = scn.nextInt();
		int nSum;
		nSum = 0;
		while (n > 0) {
			nSum = n % 10;
			n = n / 10;
		}
		if (nSum % 2 == 0) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Ňî÷ęŕ ń ęîîđäčíŕňŕěč (ő, ó) ďđčíŕäëĺćčň ÷ŕńňč ďëîńęîńňč, ëĺćŕůĺé ěĺćäó ďđ˙ěűěč ő= m, ő= n (m<n): ");
		int x1;
		int y2;
		int m1;
		int n1;
		sPo("Ââĺäčňĺ ęîîđäčíŕňű ňî÷ęč");
		x1 = scn.nextInt();
		y2 = scn.nextInt();
		sPo("Ââĺäčňĺ m č n");
		m1 = scn.nextInt();
		n1 = scn.nextInt();
		if (x1 > m1 && x1 < n1) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Ęâŕäđŕň çŕäŕííîăî ňđĺőçíŕ÷íîăî ÷čńëŕ đŕâĺí ęóáó ńóěěű öčôđ ýňîăî ÷čńëŕ: ");
		sPo("Ââĺäčňĺ ÷čńëî");
		int num;
		int temp;
		num = scn.nextInt();
		temp = num % 10 + (num / 10) % 10 + (num / 100) % 10;

		if ((Math.pow(num, 2)) == Math.pow(temp, 3)) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("• Ńóěěŕ ęŕęčő-ëčáî äâóő öčôđ çŕäŕííîăî ňđĺőçíŕ÷íîăî íŕňóđŕëüíîăî ÷čńëŕ N đŕâíŕ ňđĺňüĺé öčôđĺ: ");
		int nMain;
		int n01;
		int n02;
		int n03;
		sPo("Ââĺäčňĺ ňđĺőçíŕ÷íîĺ ÷čńëî");
		nMain = scn.nextInt();
		n01 = nMain % 10;
		nMain = nMain / 10;
		n02 = nMain % 10;
		nMain = nMain / 10;
		n03 = nMain % 10;
		if (n01 + n02 == n03 || n01 + n03 == n02 || n02 + n03 == n01) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Ňđĺóăîëüíčę ńî ńňîđîíŕěč ŕ,b,ń ˙âë˙ĺňń˙ đŕâíîáĺäđĺííűě: ");
		sPo("Ââĺäčňĺ çíŕ÷ĺíč˙ ńňîđîí ňđĺóăîëüíčęŕ");
		int aSide;
		int bSide;
		int cSide;
		aSide = scn.nextInt();
		bSide = scn.nextInt();
		cSide = scn.nextInt();
		if (aSide == bSide || aSide == cSide || bSide == cSide) {
			printTrue();
		} else {
			printFalse();
		}
		sPo("Çŕäŕííîĺ ÷čńëî N ˙âë˙ĺňń˙ ńňĺďĺíüţ ÷čńëŕ ŕ (ďîęŕçŕňĺëü ńňĺďĺíč ěîćĺň íŕőîäčňüń˙ â äčŕďŕçîíĺ îň 0 äî 4): ");
		int nN;
		int a;
		boolean flag;
		flag = false;
		sPo("Ââĺäčňĺ N");
		nN = scn.nextInt();
		sPo("Ââĺäčňĺ a");
		a = scn.nextInt();
		for (int i = 0; i <= 4; i++) {

			if (nN == Math.pow(a, i)) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			printTrue();
		} else {
			printFalse();
		}

		sPo("Ăđŕôčę ôóíęöčč ó = ŕő2 + bő+ ń ďđîőîäčň ÷ĺđĺç çŕäŕííóţ ňî÷ęó ń ęîîđäčíŕňŕěč (m, n): ");
		int aSq;
		int bSq;
		int cSq;
		int mSq;
		int nSq;

		sPo("Ââĺäčňĺ a, b, c");
		aSq = scn.nextInt();
		bSq = scn.nextInt();
		cSq = scn.nextInt();
		sPo("Ââĺäčňĺ m, n");
		mSq = scn.nextInt();
		nSq = scn.nextInt();
		if (nSq == (aSq * Math.pow(mSq, 2) + bSq * mSq + cSq)) {
			printTrue();
		} else {
			printFalse();
		}

	}

	static void printTrue() {
		System.out.println("true");
	}

	static void printFalse() {
		System.out.println("false");

	}

	static void sPo(String str) {
		System.out.println(str);
	}
}
