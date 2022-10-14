import { Component, OnInit } from '@angular/core';
import {faUser} from '@fortawesome/free-solid-svg-icons';
import {faInstagram,faLinkedin} from '@fortawesome/free-brands-svg-icons';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  login = faUser;
  instagram = faInstagram;
  linkedin = faLinkedin
  constructor() { }

  ngOnInit(): void {
  }

}
