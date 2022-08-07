import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sig',
  templateUrl: './sig.component.html',
  styleUrls: ['./sig.component.css']
})
export class SigComponent implements OnInit {

  usuario:any = {};
  loading:boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  crear(){

  }

  regresar(){
    location.href = "/"; 
  }
}
