import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { CreateCampaignComponent } from './create-campaign/create-campaign.component';
import { CampaignDetailsComponent } from './campaign-details/campaign-details.component';
import { CampaignListComponent } from './campaign-list/campaign-list.component';
import { SellersListComponent } from './sellers-list/sellers-list.component';

import { HttpClientModule } from '@angular/common/http';
import { CampaignsListComponent } from './campaigns-list/campaigns-list.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { NgMultiSelectDropDownModule } from 'ng-multiselect-dropdown';



@NgModule({
  declarations: [
    AppComponent,
    CreateCampaignComponent,
    CampaignDetailsComponent,
    CampaignListComponent,
    SellersListComponent,
    CampaignsListComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule, 
    NgMultiSelectDropDownModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
