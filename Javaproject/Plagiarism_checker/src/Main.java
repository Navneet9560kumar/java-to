package Javaproject.Plagiarism_checker.src;

public class Main {
      public static void main(String[] args) {
          String sourceFile = "input/source.txt";
          String testFile = "input/test.txt";
  
          System.out.println("🔍 Checking plagiarism...");
          PlagiarismChecker checker = new PlagiarismChecker(sourceFile, testFile);
          double plagiarismScore = checker.checkPlagiarism();
  
          System.out.println("✅ Plagiarism Detection Completed!");
          System.out.printf("📊 Plagiarism Score: ~%.2f%%\n", plagiarismScore);
      }
  }
  