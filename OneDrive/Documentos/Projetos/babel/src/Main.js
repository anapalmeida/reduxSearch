import { useSelector } from "react-redux";
import Search from "./Search";
import Viewer from "./Viewer";

function Main() {
  const searchItem = useSelector((state) => state.searchItem);

  return (
    <div>
      <Search />
      <Viewer content={searchItem} />
    </div>
  );
}

export default Main;
