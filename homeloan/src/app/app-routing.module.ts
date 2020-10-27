import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent} from './home/home.component';
import { LoginComponent} from './login/login.component';
import { AboutusComponent} from './aboutus/aboutus.component';
import { CalculatorComponent} from './calculator/calculator.component';
import { ApplicationComponent} from './application/application.component';
import { FAQComponent} from './faq/faq.component';
const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'homeLink',component:HomeComponent},
  {path:'aboutusLink',component:AboutusComponent},
  {path:'calculatorLink',component:CalculatorComponent},
  {path:'applicationLink',component:ApplicationComponent},
  {path:'loginLink',component:LoginComponent},
  {path:'faqLink',component:FAQComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
