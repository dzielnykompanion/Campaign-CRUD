export class Seller {
    id:        number;
    name:      string;
    funds:     number;
    campaigns: Campaign[];
}

export class Campaign {
    constructor(
    public id:           number,
    public name:         string,
    public keywords:     Keyword[],
    public bidAmount:    number,
    public campaignFund: number,
    public status:       string,
    public town:         Town,
    public radius:       number,
    public sellerId:     number,
    ){}
}

export class Keyword {
    id:      number;
    keyword: string;
}

export class Town {
    id:   number;
    name: string;
}
