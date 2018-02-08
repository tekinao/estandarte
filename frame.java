public class MyClass {
    public static void main(String args[]) {
        
        int i, j, matriz[][];
        int corHex[][] = {{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,8,8,8,8,0,0,0,0,0,0,8,8,8,8,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,8,8,8,8,0,0,0,0,0,0,8,8,8,8,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};
      
        matriz = new int[30][30];
        
        criaIDsMatriz(matriz);
        imprimeCorHex(matriz, corHex);
        
    System.out.print("{");
    for (i=0;i<30;i++){
        System.out.print("{");
        for (j=0;j<30;j++){
            System.out.print(matriz[i][j] + ", " );
        }
        System.out.print("},");
    }    
    System.out.println("}");
        
 
    }
    
public static void criaIDsMatriz(int matriz[][]){  
  //Atribui os id dos LEDs para a matriz: 
  int h = 0,i,j,count=0,linhas = 5, l=0,c=30, strips = 6, strip=0, bitW = 1;
     
  for(h=0; h<strips; h++ ) {
    for(i=0;i<linhas;i++){ //linhas de 0 até L-1
      if(i%2 == 0){  //se for par
        for(j=0;j<c;j++){  //colunas de 0 até C-1               
          matriz[l][j] = count;
          count++;
           }
           } else { //se for ímpar
            for(j=c-1;j>=0;j--){  //colunas de C-1 até 0
              matriz[l][j] = count;
              count++;
        }
      }
      if(count>149){ //zera cont a cada 150 leds, para mudar de canal
        count=0;
      }
      l++;
    }      
  }
}
    
    
public static void imprimeCorHex(int matriz[][], int corHex[][]){
  //Imprime os valores da matriz e corHex
    int i,j,k,strip=0, matrizTemp[][], corHexTemp[][];
    
    matrizTemp = new int[6][150];
    corHexTemp = new int[6][150];
    
    k = 0;
    for (i=0;i<30;i++){
        for (j=0;j<30;j++){
            if(matriz[i][j]==0){
              strip++;
              k = 0;
            }
            switch(strip){
              case 1:
                matrizTemp[0][k] = matriz[i][j];
                corHexTemp[0][k] = corHex[i][j];
                break;
              case 2:
                 matrizTemp[1][k] = matriz[i][j];
                corHexTemp[1][k] = corHex[i][j];
                break;
              case 3:
                 matrizTemp[2][k] = matriz[i][j];
                corHexTemp[2][k] = corHex[i][j];
                break;
              case 4:
                 matrizTemp[3][k] = matriz[i][j];
                corHexTemp[3][k] = corHex[i][j];
                break;
              case 5:
                 matrizTemp[4][k] = matriz[i][j];
                corHexTemp[4][k] = corHex[i][j];
                break;
              case 6:
                 matrizTemp[5][k] = matriz[i][j];
                corHexTemp[5][k] = corHex[i][j];
                break;
        
            }
            k++;
             
        }
    }
    
    System.out.print("{");
    for (i=0;i<6;i++){
        System.out.print("{");
        for (j=0;j<150;j++){
            if(j<149)
            System.out.print(corHexTemp[i][j] + ", " );
            else
            System.out.print(corHexTemp[i][j]);
        }
        if(i<5)
        System.out.print("},");
        else
        System.out.print("}");
    }    
    System.out.println("}");
}

}


