import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page {

  usuario: any = {}
  errorInicio: boolean = false;
  crearUsuario: boolean = false;

  constructor(private http:HttpClient) {}

  ingresar(){
    if(this.usuario.nombre&&this.usuario.contrasena){
    this.loginService().subscribe(
      data=>this.iniciarSesion(data)
    )
    }
    else{
      alert("llene todos los campos")
    }
  }

  iniciarSesion(resultado:any){
    if(resultado){
      localStorage.setItem("usuario",JSON.stringify(resultado));
      location.href = "/tabs/tab2";
    }
    else{
      this.errorInicio = true;
    }
  }

  loginService(){
    var httpOptions = {
      headers:new HttpHeaders({
      'Content-Type':'application/json'
      })
      
    }
    return this.http.post<any>("http://localhost:3030/usuario/login",this.usuario, httpOptions);
  }

  crearCuenta(){
    this.crearUsuario = !this.crearUsuario;
  }

  crear(){
    if(this.usuario.nombre&&this.usuario.contrasena){
    this.usuario.rolidrol = 2;
    this.createService().subscribe(
      data=>this.confirmar(data)
    )
    }
    else{
      alert("Llene todos los campos")
    }
  }

  confirmar(resultado:any){
    if(resultado){
      alert("Usuario creado exitosamente")
      this.usuario = {};
      this.crearCuenta(); 
    }
    else{
      alert("Error al crear el usuario")
    }
  }

  createService(){
    var httpOptions = {
      headers:new HttpHeaders({
      'Content-Type':'application/json'
      })
      
    }
    return this.http.post<any>("http://localhost:3030/usuario/guardar",this.usuario, httpOptions);
  }

  regresar(){
    this.crearUsuario = !this.crearUsuario;
  }



  #final
}
