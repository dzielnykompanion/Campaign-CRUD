import { Component, OnInit } from '@angular/core';
import { Campaign, Town } from '../Models';
import { CampaignService } from '../services/campaign.service';
import { KeywordService } from '../services/keyword.service';
import { SellerService } from '../services/seller.service';
import { TownService } from '../services/town.service';

@Component({
  selector: 'app-campaign-details',
  templateUrl: './campaign-details.component.html',
  styleUrls: ['./campaign-details.component.css']
})

export class CampaignDetailsComponent implements OnInit {
  
  keywords = [];
  sellers = [];
  towns = [];
  dropdownSettings = {};

  constructor(
    private _campaignService: CampaignService,
    private _sellerService: SellerService,
    private _townService: TownService,
    private _keywordService: KeywordService
    ){};


  ngOnInit() {
    this.loadTowns()
    this.loadKeywords()
    this.loadSellers()
    this.dropdownSettings = {
      singleSelection: false,
      idField: 'id',
      textField: 'keyword',
      selectAllText: 'Select All',
      unSelectAllText: 'UnSelect All',
      itemsShowLimit: 8,
      allowSearchFilter: true
    };
  }

  loadSellers() {
    this._sellerService.getSellerList()
    .subscribe
    (
      data =>
      {
        console.log(data);
        this.sellers = data;
      }
    )
  }
  
    loadTowns() {
      this._townService.getTownList()
      .subscribe
      (
        data =>
        {
          console.log(data);
          this.towns = data;
        }
      )
    }
    

    loadKeywords() {
      this._keywordService.getKeywordList()
      .subscribe
      (
        data =>
        {
          console.log(data);
          this.keywords = data;
        }
      )
    }


  onSubmit(data, sellerId) {
    this._campaignService.createCampaign(data, sellerId).subscribe(
      (data) => {
        console.log(data);
      },
      (error) => console.log(error)
    );
  }


  onItemSelect(item: any) {
    console.log(item);
  }
  onSelectAll(items: any) {
    console.log(items);
  }


}
