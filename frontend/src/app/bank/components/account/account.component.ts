import { AccountTS } from "../../types/tstypes/Accountts";

export class AccountComponent {
    account:any=AccountTS;
    constructor(){
        this.account=new AccountTS("1",1000.00,"1");
    }
    
}
