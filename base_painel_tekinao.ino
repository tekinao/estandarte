#include <Adafruit_NeoPixel.h>

Adafruit_NeoPixel strip1 = Adafruit_NeoPixel(150, 22, NEO_GRB + NEO_KHZ800); //roxo
Adafruit_NeoPixel strip2 = Adafruit_NeoPixel(150, 24, NEO_GRB + NEO_KHZ800); //azul
Adafruit_NeoPixel strip3 = Adafruit_NeoPixel(150, 26, NEO_GRB + NEO_KHZ800); //cinza
Adafruit_NeoPixel strip4 = Adafruit_NeoPixel(150, 28, NEO_GRB + NEO_KHZ800); //branco
Adafruit_NeoPixel strip5 = Adafruit_NeoPixel(150, 30, NEO_GRB + NEO_KHZ800); //amrelo
Adafruit_NeoPixel strip6 = Adafruit_NeoPixel(150, 32, NEO_GRB + NEO_KHZ800); //verde

//Matriz com id leds
int matriz[30][30];

//Matriz com cores Hexadecimal 
int corHex[30][30];

//Paleta Cor definida 12 = (Cor=index)(Black=0, Red=1, Purple=2, Magenta=3, LightPink=4, Blue=5, DodgerBlue=6, Cyan=7, Lime=8, LimeGreen=9, Yellow=10, Orange=11)
uint32_t PaletaCor[]={0,0xFF0000,0x9900CC,0xFF00FF,0xFF99FF,0x0000FF,0x0099FF,0x00FFFF,0x00FF00,0x000CC33,0xFFFF00,0xFFA500};

void setup() {  
  // put your setup code here, to run once:

  //inicializa com brilho 60 (1/3)
  inicializaPainel(60);

  //Inicializa a matriz com os ids dos leds
  criaIDsMatriz();     
}

void loop() {
// put your main code here, to run repeatedly:
  
  //define a imagem antes de imprimir
  corHex[30][30]={}; //colocar o parse

  //imprimi a imagem no painel
  imprimeMatriz();
  delay(3000);
  
} 

void inicializaPainel(int brilho){
  strip1.begin();
  strip2.begin();
  strip3.begin();
  strip4.begin();
  strip5.begin();
  strip6.begin();

  strip1.setBrightness(brilho);
  strip2.setBrightness(brilho);
  strip3.setBrightness(brilho);
  strip4.setBrightness(brilho);
  strip5.setBrightness(brilho);
  strip6.setBrightness(brilho);

  strip1.show();
  strip2.show();
  strip3.show();
  strip4.show();
  strip5.show();
  strip6.show();
}

void criaIDsMatriz(){  
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

void imprimeMatriz(){
  //Imprime os valores da matriz e corHex
    int i,j,strip=0;
    for (i=0;i<30;i++){
        for (j=0;j<30;j++){
            if(matriz[i][j]==0){
              strip++;
            }           
            switch(strip){
              case 1:
                strip1.setPixelColor(matriz[i][j], PaletaCor[corHex[i][j]]);
                break;
              case 2:
                strip2.setPixelColor(matriz[i][j], PaletaCor[corHex[i][j]]);
                break;
              case 3:
                strip3.setPixelColor(matriz[i][j], PaletaCor[corHex[i][j]]);
                break;
              case 4:
                strip4.setPixelColor(matriz[i][j], PaletaCor[corHex[i][j]]);
                break;
              case 5:
                strip5.setPixelColor(matriz[i][j], PaletaCor[corHex[i][j]]);
                break;
              case 6:
                strip6.setPixelColor(matriz[i][j], PaletaCor[corHex[i][j]]);
                break;
              default:
                strip6.setPixelColor(matriz[i][j], PaletaCor[corHex[i][j]]);
                break;
            }
        }
    }
    strip1.show();
    strip2.show();
    strip3.show();
    strip4.show();
    strip5.show();
    strip6.show();
}
    
