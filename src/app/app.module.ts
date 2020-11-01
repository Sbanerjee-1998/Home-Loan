import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { ApplicationComponent } from './application/application.component';
import { FAQComponent } from './faq/faq.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { LoanTypesComponent } from './loan-types/loan-types.component';
import { EmicalculatorComponent } from './emicalculator/emicalculator.component';
import { EligibilitycalculatorComponent } from './eligibilitycalculator/eligibilitycalculator.component';
import { LoanTrackerComponent } from './loan-tracker/loan-tracker.component';
import { LearnComponent } from './learn/learn.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RegistrationComponent,
    LoginComponent,
    ApplicationComponent,
    FAQComponent,
    AboutusComponent,
    LoanTypesComponent,
    EmicalculatorComponent,
    EligibilitycalculatorComponent,
    LoanTrackerComponent,
    LearnComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
