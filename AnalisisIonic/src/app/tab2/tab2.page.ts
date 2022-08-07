import { Component } from '@angular/core';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {

  usuario:any = {};

  constructor() {
    this.usuario = JSON.parse(localStorage.getItem("usuario"));
    if(!this.usuario){
      location.href = "/tabs/tab1";
    }
  }

  logout(){
    localStorage.removeItem("usuario");
    location.href = "/tabs/tab1";
  }

}
