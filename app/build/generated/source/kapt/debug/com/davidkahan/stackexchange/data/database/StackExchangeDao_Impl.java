package com.davidkahan.stackexchange.data.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.davidkahan.stackexchange.datamodels.Question;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StackExchangeDao_Impl implements StackExchangeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Question> __insertionAdapterOfQuestion;

  public StackExchangeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuestion = new EntityInsertionAdapter<Question>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `questions_table` (`id`,`isAnswered`,`title`,`score`,`answerCount`,`lastActivityDate`,`creationDate`,`viewCount`,`link`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Question value) {
        stmt.bindLong(1, value.getId());
        final int _tmp;
        _tmp = value.isAnswered() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        stmt.bindLong(4, value.getScore());
        stmt.bindLong(5, value.getAnswerCount());
        stmt.bindLong(6, value.getLastActivityDate());
        stmt.bindLong(7, value.getCreationDate());
        stmt.bindLong(8, value.getViewCount());
        if (value.getLink() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLink());
        }
      }
    };
  }

  @Override
  public void insertQuestions(final List<Question> questions) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuestion.insert(questions);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public PagingSource<Integer, Question> getAllQuestions() {
    final String _sql = "SELECT * FROM questions_table ORDER BY creationDate DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Question>() {
      @Override
      public LimitOffsetDataSource<Question> create() {
        return new LimitOffsetDataSource<Question>(__db, _statement, false , "questions_table") {
          @Override
          protected List<Question> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfIsAnswered = CursorUtil.getColumnIndexOrThrow(cursor, "isAnswered");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(cursor, "score");
            final int _cursorIndexOfAnswerCount = CursorUtil.getColumnIndexOrThrow(cursor, "answerCount");
            final int _cursorIndexOfLastActivityDate = CursorUtil.getColumnIndexOrThrow(cursor, "lastActivityDate");
            final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(cursor, "creationDate");
            final int _cursorIndexOfViewCount = CursorUtil.getColumnIndexOrThrow(cursor, "viewCount");
            final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(cursor, "link");
            final List<Question> _res = new ArrayList<Question>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Question _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final boolean _tmpIsAnswered;
              final int _tmp;
              _tmp = cursor.getInt(_cursorIndexOfIsAnswered);
              _tmpIsAnswered = _tmp != 0;
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final int _tmpScore;
              _tmpScore = cursor.getInt(_cursorIndexOfScore);
              final int _tmpAnswerCount;
              _tmpAnswerCount = cursor.getInt(_cursorIndexOfAnswerCount);
              final long _tmpLastActivityDate;
              _tmpLastActivityDate = cursor.getLong(_cursorIndexOfLastActivityDate);
              final long _tmpCreationDate;
              _tmpCreationDate = cursor.getLong(_cursorIndexOfCreationDate);
              final int _tmpViewCount;
              _tmpViewCount = cursor.getInt(_cursorIndexOfViewCount);
              final String _tmpLink;
              _tmpLink = cursor.getString(_cursorIndexOfLink);
              _item = new Question(_tmpId,_tmpIsAnswered,_tmpTitle,_tmpScore,_tmpAnswerCount,_tmpLastActivityDate,_tmpCreationDate,_tmpViewCount,_tmpLink);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  @Override
  public PagingSource<Integer, Question> getFilteredQuestionsByIsAnswered(
      final boolean isAnswered) {
    final String _sql = "SELECT * FROM questions_table WHERE isAnswered = ? ORDER BY creationDate DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isAnswered ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return new DataSource.Factory<Integer, Question>() {
      @Override
      public LimitOffsetDataSource<Question> create() {
        return new LimitOffsetDataSource<Question>(__db, _statement, false , "questions_table") {
          @Override
          protected List<Question> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfIsAnswered = CursorUtil.getColumnIndexOrThrow(cursor, "isAnswered");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(cursor, "score");
            final int _cursorIndexOfAnswerCount = CursorUtil.getColumnIndexOrThrow(cursor, "answerCount");
            final int _cursorIndexOfLastActivityDate = CursorUtil.getColumnIndexOrThrow(cursor, "lastActivityDate");
            final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(cursor, "creationDate");
            final int _cursorIndexOfViewCount = CursorUtil.getColumnIndexOrThrow(cursor, "viewCount");
            final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(cursor, "link");
            final List<Question> _res = new ArrayList<Question>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Question _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final boolean _tmpIsAnswered;
              final int _tmp_1;
              _tmp_1 = cursor.getInt(_cursorIndexOfIsAnswered);
              _tmpIsAnswered = _tmp_1 != 0;
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final int _tmpScore;
              _tmpScore = cursor.getInt(_cursorIndexOfScore);
              final int _tmpAnswerCount;
              _tmpAnswerCount = cursor.getInt(_cursorIndexOfAnswerCount);
              final long _tmpLastActivityDate;
              _tmpLastActivityDate = cursor.getLong(_cursorIndexOfLastActivityDate);
              final long _tmpCreationDate;
              _tmpCreationDate = cursor.getLong(_cursorIndexOfCreationDate);
              final int _tmpViewCount;
              _tmpViewCount = cursor.getInt(_cursorIndexOfViewCount);
              final String _tmpLink;
              _tmpLink = cursor.getString(_cursorIndexOfLink);
              _item = new Question(_tmpId,_tmpIsAnswered,_tmpTitle,_tmpScore,_tmpAnswerCount,_tmpLastActivityDate,_tmpCreationDate,_tmpViewCount,_tmpLink);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  @Override
  public LiveData<List<Question>> getFilteredQuestionsLiveDataByIsAnswered(
      final boolean isAnswered) {
    final String _sql = "SELECT * FROM questions_table WHERE isAnswered = ? ORDER BY creationDate DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isAnswered ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return __db.getInvalidationTracker().createLiveData(new String[]{"questions_table"}, false, new Callable<List<Question>>() {
      @Override
      public List<Question> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIsAnswered = CursorUtil.getColumnIndexOrThrow(_cursor, "isAnswered");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(_cursor, "score");
          final int _cursorIndexOfAnswerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "answerCount");
          final int _cursorIndexOfLastActivityDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastActivityDate");
          final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creationDate");
          final int _cursorIndexOfViewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "viewCount");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
          final List<Question> _result = new ArrayList<Question>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Question _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final boolean _tmpIsAnswered;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsAnswered);
            _tmpIsAnswered = _tmp_1 != 0;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpScore;
            _tmpScore = _cursor.getInt(_cursorIndexOfScore);
            final int _tmpAnswerCount;
            _tmpAnswerCount = _cursor.getInt(_cursorIndexOfAnswerCount);
            final long _tmpLastActivityDate;
            _tmpLastActivityDate = _cursor.getLong(_cursorIndexOfLastActivityDate);
            final long _tmpCreationDate;
            _tmpCreationDate = _cursor.getLong(_cursorIndexOfCreationDate);
            final int _tmpViewCount;
            _tmpViewCount = _cursor.getInt(_cursorIndexOfViewCount);
            final String _tmpLink;
            _tmpLink = _cursor.getString(_cursorIndexOfLink);
            _item = new Question(_tmpId,_tmpIsAnswered,_tmpTitle,_tmpScore,_tmpAnswerCount,_tmpLastActivityDate,_tmpCreationDate,_tmpViewCount,_tmpLink);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Question> getAllLocalQuestions() {
    final String _sql = "SELECT * FROM questions_table ORDER BY creationDate DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfIsAnswered = CursorUtil.getColumnIndexOrThrow(_cursor, "isAnswered");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(_cursor, "score");
      final int _cursorIndexOfAnswerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "answerCount");
      final int _cursorIndexOfLastActivityDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastActivityDate");
      final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creationDate");
      final int _cursorIndexOfViewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "viewCount");
      final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
      final List<Question> _result = new ArrayList<Question>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Question _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final boolean _tmpIsAnswered;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsAnswered);
        _tmpIsAnswered = _tmp != 0;
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final int _tmpScore;
        _tmpScore = _cursor.getInt(_cursorIndexOfScore);
        final int _tmpAnswerCount;
        _tmpAnswerCount = _cursor.getInt(_cursorIndexOfAnswerCount);
        final long _tmpLastActivityDate;
        _tmpLastActivityDate = _cursor.getLong(_cursorIndexOfLastActivityDate);
        final long _tmpCreationDate;
        _tmpCreationDate = _cursor.getLong(_cursorIndexOfCreationDate);
        final int _tmpViewCount;
        _tmpViewCount = _cursor.getInt(_cursorIndexOfViewCount);
        final String _tmpLink;
        _tmpLink = _cursor.getString(_cursorIndexOfLink);
        _item = new Question(_tmpId,_tmpIsAnswered,_tmpTitle,_tmpScore,_tmpAnswerCount,_tmpLastActivityDate,_tmpCreationDate,_tmpViewCount,_tmpLink);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
