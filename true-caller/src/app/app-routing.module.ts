import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { AppComponent } from './app.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { HomeComponent } from './home/home.component';
import { SearchComponent } from './search/search.component';
import { SpamComponent } from './spam/spam.component';

const routes: Routes = [
  {
    path : "" , redirectTo : "home" , pathMatch:"full"
  },
  {
    path : "home" , component: HomeComponent
  },
  {
    path : "search" , component: SearchComponent
  },
  {
    path : "aboutUs" , component: AboutUsComponent
  },
  {
    path : "spam" , component: SpamComponent
  },
  {
    path : "contactUs" , component: ContactUsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
