import { useSelector } from "react-redux";


function Header(){
    const state=useSelector((state)=>state);
    console.log("Header ",state.loggedin.Username)
    return (
        <div className="jumbotron p-3 mb-0 rounded-0 bg-transparent text-white">
            <h5 style={{marginBottom: "-10px"}}><marquee style={{color: "white"}}>Welcome to E-Grocery !!! Great Discounts on products Today. Shop now !!
           
                </marquee></h5>
            <div className="clearfix"></div>
        </div>
    )
}

export default Header;

