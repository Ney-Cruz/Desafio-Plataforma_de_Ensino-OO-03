package package11_OrientacaoObjeto3.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import package11_OrientacaoObjeto3.challenge.entities.Lesson;
import package11_OrientacaoObjeto3.challenge.entities.Task;
import package11_OrientacaoObjeto3.challenge.entities.Video;

public class AppPlataformaEnsino {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = scan.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Dados da "+ (i + 1) +"a aula:");
			
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char typeOfClass = scan.next().charAt(0);
			
			scan.nextLine();
			
			System.out.print("Título: ");
			String title = scan.nextLine();
			
			if (typeOfClass == 'c') {
	
				System.out.print("URL do vídeo: ");
				String url = scan.nextLine();

				System.out.print("Duração em segundos: ");
				int duration = scan.nextInt();
				
				list.add(new Video(title, url, duration));
				
			} else {
			
				System.out.print("Descrição: ");
				String description = scan.nextLine();
				
				System.out.print("Quantidade de questões: ");
				int questionCount = scan.nextInt();	
				
				list.add(new Task(title, description, questionCount));
		}
			System.out.println();
		
		}
		System.out.print("DURAÇÃO TOTAL DO CURSO = ");
		
		int sum = 0;
		
		for (Lesson lesson : list) {
			
			sum += lesson.duration();
			
		}
		
		System.out.println(sum + " segundos");
		scan.close();
	}
	
}

