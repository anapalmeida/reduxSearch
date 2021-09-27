import { useState } from "react";
import { useDispatch } from "react-redux";

function Search() {
  const [searchItem, setSearchItem] = useState();

  const dispatch = useDispatch();

  function searchFormHandler(e) {
    e.preventDefault();

    dispatch({ type: "SEARCH_IS_MADE", searchItem: searchItem });
  }
  return (
    <div>
      <form onSubmit={searchFormHandler}>
        <div>
          <input
            type="text"
            placeholder="Procurar item..."
            id="search_item"
            onChange={(e) => setSearchItem(e.target.value)}
          />
          <button>Procurar</button>
        </div>
      </form>
    </div>
  );
}

export default Search;
