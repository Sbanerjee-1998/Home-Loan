import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent} from './home/home.component';
import { LoginComponent} from './login/login.component';
import { AboutusComponent} from './aboutus/aboutus.component';
import { EmicalculatorComponent} from './emicalculator/emicalculator.component';
import { EligibilitycalculatorComponent} from './eligibilitycalculator/eligibilitycalculator.component';
import { LoanTrackerComponent} from './loan-tracker/loan-tracker.component';
import { LoanTypesComponent} from './loan-types/loan-types.component';
import { LearnComponent} from './learn/learn.component';
import { ApplicationComponent} from './application/application.component';
import { FAQComponent} from './faq/faq.component';
import { RegistrationComponent } from './registration/registration.component';
const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'homeLink',component:HomeComponent},
  {path:'aboutusLink',component:AboutusComponent},
  {path:'loantypesLink',component:LoanTypesComponent},
  {path:'eligibilitycalculatorLink',component:EligibilitycalculatorComponent},
  {path:'emicalculatorLink',component:EmicalculatorComponent},
  {path:'applicationLink',component:ApplicationComponent},
  {path:'loantrackerLink',component:LoanTrackerComponent},
  {path:'registrationLink',component:RegistrationComponent},
  {path:'loginLink',component:LoginComponent},
  {path:'faqLink',component:FAQComponent},
  {path:'learnLink',component:LearnComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
