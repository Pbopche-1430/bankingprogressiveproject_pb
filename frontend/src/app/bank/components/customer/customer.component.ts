import { CustomerTS } from "../../types/tstypes/Customerts";

export class CustomerComponent  {
    customer:any=CustomerTS;
    constructor(){
        this.customer=new CustomerTS("John Doe", "john@example.com", "john_doe", "password123", "User","1");
    }  
}
