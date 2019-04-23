#include <iostream>
using namespace std;

int main() {

  
  float sueldoInicial;
  int opcion;
  float Incremento1=0;
  float Incremento2=0;
  float Incremento3=0;
  float Incremento4=0;

  float nuevoSueldo1=0;
  float nuevoSueldo2=0;
  float nuevoSueldo3=0;
  float nuevoSueldo4=0;


cout<<"Ingrese el sueldo actual del empleado : "<<endl; 
cin>>sueldoInicial;

cout<<"Escribe 1 si se encuentra en la categoria 1"<<endl;
cout<<"Escribe 2 si se encuentra en la categoria 2"<<endl;
cout<<"Escribe 3 si se encuentra en la categoria 3"<<endl;
cout<<"Escribe 4 si se encuentra en la categoria 4"<<endl;
cin>>opcion;
switch(opcion){

  case 1:
  
  cout<<"Categoria 1"<<endl;

Incremento1= 0.15* sueldoInicial;
nuevoSueldo1=Incremento1+sueldoInicial;
cout<<"El sueldo incial fue: "<<sueldoInicial<<endl;
cout<<"El nuevo sueldo es:"<<nuevoSueldo1<<endl;

  break;
  case 2:
    cout<<"Categoria 2"<<endl;
    Incremento2= 0.10* sueldoInicial;
nuevoSueldo2=Incremento2+sueldoInicial;
cout<<"El sueldo incial fue: "<<sueldoInicial<<endl;
cout<<"El nuevo sueldo es: "<<nuevoSueldo2<<endl;

  break;
  case 3:
    cout<<"Categoria 3"<<endl;
    Incremento3= 0.08* sueldoInicial;
nuevoSueldo3=Incremento3+sueldoInicial;
cout<<"El sueldo incial fue: "<<sueldoInicial<<endl;
cout<<"El nuevo sueldo es: "<<nuevoSueldo3<<endl;

  break;
  case 4:
    cout<<"Categoria 4"<<endl;
    Incremento4= 0.07* sueldoInicial;
nuevoSueldo4=Incremento4+sueldoInicial;
cout<<"El sueldo incial fue: "<<sueldoInicial<<endl;
cout<<"El nuevo sueldo es: "<<nuevoSueldo4<<endl;

  break;
   
   default:
   cout<<"ERROR esa opcion no existe"<<endl;

}

return 0;

  }


