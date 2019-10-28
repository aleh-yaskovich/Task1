package by.htp.task1.main;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		// 1.  Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное
		double x = 4.0;
		double y = -1.2;
		System.out.println("Задача 1. Ответы: ");
		System.out.println("-- x + y = " + (x + y));
		System.out.println("-- x - y = " + (x - y));
		System.out.println("-- x * y = " + (x * y));
		System.out.println("-- x / y = " + (x / y));
		
		// 2. Найдите значение функции: с = 3 + а
		double a = 4;
		double c = 3 + a;
		System.out.println( "Задача 2. Ответ: c = " + c );
		
		// 3. Найдите значение функции: z = 2 * x + (y – 2) * 5
		x = 5;
		y = 6.9;
		double z;
		System.out.print("Задача 3. Ответ: ");
		System.out.println("z = "+ (2 * x + (y - 2) * 5));
		
		// 4. Найдите  значение функции: z = ( (a – 3) * b / 2) + c
		a = 4;
		c = 3 + a;
		double b = 7.5;
		System.out.println("Задача 4. Ответ: z = "+ (( (a - 3) * b / 2) + c));
		
		// 5. Составить алгоритм нахождения среднего арифметического двух чисел
		a = 6.8;
		b = 2.1;
		System.out.println("Задача 5. Среднее арифметическое чисел \"a\" и \"b\" равно: "+ ((a + b) / 2));
		
		//  6. Написать код для решения задачи. В n малых бидонах 80 л молока. 
		//  Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?  
		double n = 10;
		double m = 8;
		double quantityN = 80 / n;
		double quantityM = n + 12;
		double countMilk = m * quantityM;
		System.out.println("Задача 6. В "+m+" больших бедонах "+countMilk+" литров молока");
		
		// 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника 
		double length = 5.6;
		double width =  length / 2;
		double s = length*width;
		System.out.print("Задача 7. Ответ: ");
		System.out.println("Площадь прямоугольника с длиной \""+length+"\" "+
								"и шириной \""+width+"\" равна: "+ s);
		
		// 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		// (b + √b2 + 4ac2)/a − a3c+ b−2  
		a = 1.3;
		b = 2.2;
		c = 3.1;
		double sum = (b + Math.sqrt(Math.pow(b,2)+ 4*a*c)) / 2*a - Math.pow(a,3)*c + Math.pow(b,-2);
		System.out.println("Задача 8. Ответ: " + sum);
		
		// 9. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
		a = 5.22;
		b = 12.7;
		c = 3.0;
		double d = 0.89;
		sum = (a / c)*(b / d) - (a*b - c)/(c * d);
		System.out.println("Задача 9. Ответ: " + sum);
		
		// 10. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
		x = 30;
		y = 7.5;
		sum = (Math.sin(x) + Math.cos(y))/(Math.cos(x) + Math.sin(y)) * Math.tan(x * y);
		System.out.println("Задача 10. Ответ: " + sum);
		
		// 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов
		double cathetusA = 6.9;
		double cathetusB = 8.4;
		double hypotenuse = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
		double trianglePerimeter = cathetusA + cathetusB + hypotenuse;
		double triangleArea = cathetusA * cathetusB / 2;
		System.out.println("Задача 11. Ответы: ");
		System.out.println("-- Периметр прямоугольного треугольника с катетами \""+cathetusA+"\" "+
				"и \""+cathetusB+"\" равен: "+ trianglePerimeter);
		System.out.println("-- Площадь прямоугольного треугольника с катетами \""+cathetusA+"\" "+
				"и \""+cathetusB+"\" равна: "+ triangleArea);
		
		// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)
		double x1 = 14;
		double y1 = 8;
		double x2 = 38;
		double y2 = 21;
		double axis1 = Math.abs(x1 - x2);
		double axis2 = Math.abs(y1 - y2);
		System.out.println("Задача 12. Расстояние между двумя точками с координатами ("+x1+", "+y1+") "+
		"и ("+x2+", "+y2+") равно "+Math.sqrt(Math.pow(axis1, 2) + Math.pow(axis2, 2)));
		
		// 13. Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь
		x1 = 14;
		y1 = 2;
		x2 = 38;
		y2 = 21;
		double x3 = 26;
		double y3 = 18;
		double side1 = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
		double side2 = Math.sqrt(Math.pow(Math.abs(x1 - x3), 2) + Math.pow(Math.abs(y1 - y3), 2));
		double side3 = Math.sqrt(Math.pow(Math.abs(x2 - x3), 2) + Math.pow(Math.abs(y2 - y3), 2));
		trianglePerimeter = side1 + side2 + side3;
		double p = trianglePerimeter / 2;
		triangleArea = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		System.out.println("Задача 13. Ответы: ");
		System.out.println("-- Периметр треугольника равен: " + trianglePerimeter);
		System.out.println("-- Площадь треугольника равна: " + triangleArea);
		
		// 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
		double radius = 4.5;
		double circlePer = 2*Math.PI*radius;
		double circleArea = Math.PI*Math.pow(radius, 2);
		System.out.println("Задача 14. Ответы: ");
		System.out.println("-- Длина окружности равна: " + circlePer);
		System.out.println("-- Площадь круга равна: " + circleArea);
		
		// 15. Написать программу, которая выводит на экран первые четыре степени числа π
		double value = Math.pow(10, 3);
		p = Math.round(Math.PI * value)/value;
		System.out.println("Задача 15. Ответ: " + p);
		
		// 16. Найти произведение цифр заданного четырехзначного числа
		int num = 1988;
		int num2 = num;
		int summa = 1;
		while (num2 > 0) {
			int ostatok = num2%10;
			num2 = (num2 - ostatok)/10;
			summa = summa*ostatok;
		}
		System.out.println("Задача 16. Произведение цифр числа \"" + num + "\" равно: " + summa);
		
		// 17. Даны два числа. Найти среднее арифметическое кубов этих чисел 
		//     и среднее геометрическое модулей этих чисел
		double n1 = 2;
		double n2 = 3.2;
		System.out.println("Задача 17. Ответы: ");
		System.out.println("-- Среднее арифметическое кубов чисел \""+n1+"\" и \""+n2+"\" равно: "
				+ (Math.pow(n1, 3) + Math.pow(n2, 3)) / 2);
		System.out.println("-- Среднее геометрическое модулей чисел \""+n1+"\" и \""+n2+"\" равно: "
				+ Math.sqrt(Math.abs(n1) * Math.abs(n2)));
		
		// 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба
		a = 9;
		System.out.println("Задача 18. Ответы: ");
		System.out.println("-- Площадь грани куба с длиной ребра \""+a+"\" равна: " + a*a);
		System.out.println("-- Площадь полной поверхности куба с длиной ребра \""+a+"\" равна: " + a*a*6);
		System.out.println("-- Объем куба с длиной ребра \""+a+"\" равен: " + Math.pow(a, 3));
		
		// 19. Дана сторона равностороннего треугольника. 
		//     Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей
		a = 6;
		double triangleHeigth = Math.sqrt(Math.pow(a, 2) - Math.pow(a/2, 2));
		triangleArea = a*triangleHeigth/2;
		double r1 = a/(2*Math.sqrt(3)); // вписанная
		double r2 = triangleHeigth*2/3; // описанная
		System.out.println("Задача 19. Ответы: ");
		System.out.println("-- Площадь равностороннего треугольника со стороной \""+a+"\" равна: " + triangleArea);
		System.out.println("-- Высота равностороннего треугольника со стороной \""+a+"\" равна: " + triangleHeigth);
		System.out.println("-- Радиус вписанной в равносторонний треугольник окружности равен: " + r1);
		System.out.println("-- Радиус описанной вокруг равностороннего треугольника окружности равен: " + r2);
		
		// 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью
		double l = 20;
		System.out.println("Задача 20. Площадь круга с длиной окружности \""+l+"\" равна: "
				+ Math.pow(l, 2)/(4*Math.PI) );
		
		// 21.  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
		//      Поменять местами дробную и целую части числа и вывести полученное значение числа
		double number = 123.456;
		double temp1 = Math.round(number);
		double temp2 = number - temp1;
		double temp3 = temp2*1000 + temp1/1000;
		System.out.printf("Задача 21. Исходное число: \""+ number +"\"; Ответ: "+"%.3f", temp3);
		System.out.println();
		
		// 22.  Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
		//      Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
		int countSec = 12443;
		int hours = countSec / 3600;
		int mins = (countSec - hours*3600) / 60;
		int sec = countSec - hours*3600 - mins*60;
		System.out.println("Задача 22. "+ countSec +" сек. => "+ hours +" ч. "+ mins +" мин. "+ sec +" сек.");
		
		// 23.  Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)
		double radius1 = 12.8;
		double radius2 = 5.6;
		System.out.println("Задача 23. Площадь кольца: " 
		+ (Math.PI*Math.pow(radius1, 2) - Math.PI*Math.pow(radius2, 2)));
		
		// 24.  Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а
		a = 10;
		b = 15;
		double alfa = 50;
		double radians = Math.toRadians(alfa);
		double h = ((b-a)/2) * Math.tan(radians);
		System.out.println("Задача 24. Площадь трапеции равна: " + h*(a+b)/2);
		
		// 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
		//     (предполагается, что а≠0 и что дискриминант уравнения неотрицателен)
		a = 5;
		b = 7;
		c = 2;
		double discrim = b*b - 4*a*c;
		if (discrim > 0) {
			System.out.println("Задача 25. Ответы: ");
			System.out.println("-- X1 равен: " + ( (-1*b + Math.sqrt(discrim)) / (2*a) ) );
			System.out.println("-- X2 равен: " + ( (-1*b - Math.sqrt(discrim)) / (2*a) ) );
		}
		
		// 26.  Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у
		a = 12;
		b = 16;
		alfa = 90;
		radians = Math.toRadians(alfa);
		System.out.println("Задача 26. Площадь треугольника равна " + ( a * b * Math.sin(radians) ) / 2 );
		
		// 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
		//     получить значение а8 за три операции и  а10 за четыре операции
		a = 2;
		double temp = a*a; // 1
		double temp_2 = temp*temp; // 2
		a = temp_2*temp_2; // 3
		a = a*temp; // 4
		System.out.println("Задача 27." + a);
		
		// 28.  Составить программу перевода радианной меры угла в градусы, минуты и секунды
		radians = 0.471;
		double degrees = radians * 180 / Math.PI;
		System.out.println("Задача 28. "+ radians +" радиан = "+ degrees +" градусов, или "
		+ degrees*60 +" минут, или "+ degrees*3600 +" секунд");
		
		// 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с
		a = 34;
		b = 26;
		c = 42;
		double alpha = Math.acos((b*b + c*c - a*a)/(2*b*c));
		double beta = Math.acos((a*a + c*c - b*b)/(2*a*c));
		double gamma = Math.acos((a*a + b*b - c*c)/(2*a*b));
		double degreeAlpha = alpha * 180 / Math.PI;
		double degreeBeta = beta * 180 / Math.PI;
		double degreeGamma = gamma * 180 / Math.PI;
		System.out.println("Задача 29. Ответы: ");
		System.out.println("-- Углы треугольника в радианах: "+alpha+", "+beta+", "+gamma);
		System.out.println("-- Углы треугольника в градусах: "+degreeAlpha+", "+degreeBeta+", "+degreeGamma);
		
		// 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения
		double resist1 = 0.8;
		double resist2 = 0.7;
		double resist3 = 1.3;
		double resistance = 1/(1/resist1 + 1/resist2 + 1/resist3);
		System.out.println("Задача 30. Cопротивление соединения = " + resistance);
		
		// 31.  Составить программу для вычисления пути, пройденного лодкой, 
		//      если ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч,
		//      время движения по озеру t1 ч, а против течения реки — t2 ч
		double v = 10;
		double v1 = 2;
		double t1 = 1.3;
		double t2 = 1.2;
		double distance = v*t1 + (v-v1)*t2;
		System.out.println("Задача 31. Путь лодки составил " + distance + " км");
		
		// 32.  Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
		//      Какое время будут показывать часы через р ч q мин r с?
		// то, что есть сейчас
		int hourNow = (int)(Math.random()*24 - 1);
		int minNow = (int)(Math.random()*60 - 1);
		int secundNow = (int)(Math.random()*60 - 1);
		// то, что добавляем
		int hour = 2;
		int minute = 45;
		int secund = 32;
		// то, что получится
		int secundFut = (secundNow + secund) % 60;
		int minuteFut = (minNow + minute + (secundNow + secund)/60) % 60;
		int hourFut = (hourNow + hour + (minNow + minute + (secundNow + secund)/60)/60) % 24;
		System.out.println("Задача 32. Текущее время "+hourNow+" : "+minNow+" : "+secundNow);
		System.out.println("Задача 32. Время через "+hour+"ч "+minute+"мин "+secund+"сек = "+hourFut+" : "+minuteFut+" : "+secundFut);
		
		// 33.  Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы
		Scanner sc = new Scanner(System.in);
        System.out.print("Задача 33. Введите любой символ: ");
        char ch = sc.next().charAt(0);
        System.out.println("Задача 33. Код элемента \""+ch+"\" равен "+(byte)ch);
        System.out.println("Задача 33. Предыдущий элемент: \""+(char)((byte)ch - 1)+"\" ("+((byte)ch - 1)
        		+"), следующий элемент: \""+(char)((byte)ch + 1)+"\" ("+((byte)ch + 1)+").");
		
		// 34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации
		double volumeBite = 4000;
		System.out.println("Задача 34. Ответ: "+volumeBite+" байт - это "+volumeBite / 1024+" килобайт или "+volumeBite / 1024 / 1024+ " мегабайт");
		
		// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
		m = 43;
		n = 3;
		int res = (int)Math.floor(m/n);
		int res2 = (int)Math.floor((m/n - res)*10);
		System.out.println("Задача 35. "+res%10+"."+res2);
		
		// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа
		int number2 = 1234;
		int odd = 1;
		int even = 1;
		int number2copy = number2;
		while (number2copy > 0) {
			int ostat = number2copy % 10;
			if (ostat % 2 == 0) {
				even = even*ostat;
			} else {
				odd = odd*ostat;
			}
			number2copy = number2copy / 10;
		}
		System.out.println("Задача 36. Частное произведений четных и нечетных цифр числа "+number2+" равно "+((double)even / odd));
		
		// 37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
		//     и false — в противном случае
		System.out.println("Задача 37. Ответы: ");
		// Целое число N является четным двузначным числом
		int varN = 42;
		if (varN >= 10 && varN <= 99 && varN%2 == 0) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр
		varN = 4233;
		if ( (varN%10 + varN%100/10) == (varN%1000/100 + varN%10000/1000) ) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// Сумма цифр данного трехзначного числа N является четным числом
		varN = 337;
		if ( (varN%10 + varN%100/10 + varN%1000/100)%2 == 0 ) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х=m, х=n (m<n).
		m = 4;
		n = 12;
		x = 6; 
		if (x >= m && x <= n) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
		varN = 337;
		if ( Math.pow(varN, 2) == Math.pow((varN%10 + varN%100/10 + varN%1000/100), 3) ) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// Треугольник со сторонами а,b,с является равнобедренным
		a = 10; 
		b = 10; 
		c = 12;
		if ( a == b || a == c || b == c ) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре
		varN = 335;
		int a1 = varN%10;
		int b1 = varN%100/10;
		int c1 = varN%1000/100;
		if ( (a1+b1) == c1 || (a1+c1) == b1 || (b1+c1) == a1 ) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4)
		varN = 25;
		a1 = 5;
		if ( Math.pow(a1, 0) == varN ||
			 Math.pow(a1, 1) == varN ||
			 Math.pow(a1, 2) == varN ||
			 Math.pow(a1, 3) == varN ||
			 Math.pow(a1, 4) == varN ) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// График функции у = ах2 + bх + с проходит через заданную точку с координатами (m, п)
		m = 10;
		n = 8;
		if ( a*m*m + b*m + c == n ) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		
		// 38. Для данных областей составить линейную программу, которая печатает true, 
		//     если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
		x1 = 3;
		y1 = 1;
		System.out.println("Задача 38. Ответы: ");
		// для треугольника
		if (x1 >= -4 && x1 <= 0 && y1 <= (4 - Math.abs(x1))) {
			System.out.println("---> true");
		} else if (x1 >= 0 && x1 <= 4 && y1 <= (4 - Math.abs(x1))) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// для двух прямоугольников
		if (x1 >= -2 && x1 <= 2 && y1 >= 0 && y1 <= 4) {
			System.out.println("---> true");
		} else if (x1 >= -4 && x1 <= 4 && y1 >= -3 && y1 <= 0) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		// для двух секторов
		if (Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2)) <= 4 && x >= 0 && y >= 0 ) {
			System.out.println("---> true");
		} else if (Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2)) <= 5 && x >= 0 && y <= 0) {
			System.out.println("---> true");
		} else {
			System.out.println("---> false");
		}
		
		// 39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, 
		//     кроме умножения, сложения и вычитания, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.
		x = 5; 
		System.out.println( "Задача 39. За 9 операций (x*(x*x*(2*x-3)+(4*x-5))+6) = " + x*(x*x*(2*x - 3) + (4*x - 5))+6 );
		
		// 40.  Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций
		x = 5;
		System.out.println("Задача 40. Ответы: ");
		System.out.println("---> x*(x*(3-4*x)-2) = "+ x*(x*(3-4*x)-2));
		System.out.println("---> 1+x*(2+x*(3+4*x)) = "+ 1+x*(2+x*(3+4*x)));
		
		
		
		

	}
	
}
